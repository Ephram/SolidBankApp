package kz.dulatibrayev.solidbankapp.cli.basic;

import java.util.List;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.app.BankCore;
import kz.dulatibrayev.solidbankapp.cli.interfaces.CreateAccountOperationUI;
import kz.dulatibrayev.solidbankapp.enums.AccountType;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;

public class AccountBasicCLI {
	private CreateAccountOperationUI createAccountOperationUI;
	private BankCore bankCore;
	private AccountListingService accountListing;

	public AccountBasicCLI(CreateAccountOperationUI accountOperationUI, BankCore bankCore,
			AccountListingService accountListingService) {
		this.createAccountOperationUI = accountOperationUI;
		this.bankCore = bankCore;
		this.accountListing = accountListingService;

	}

	public void createAccountRequest(String clientID) {
		AccountType accountType = this.createAccountOperationUI.requestAccountType();
		if (accountType != null) {
			this.bankCore.createNewAccount(accountType, clientID);
			System.out.println(accountType.toString() + " account successfully created");
		}

	}

	public void getAccounts(String clientID) {
		System.out.println(accountListing.getClientAccounts(clientID));

	}

}
