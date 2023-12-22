package kz.dulatibrayev.solidbankapp.cli.basic;

import kz.dulatibrayev.solidbankapp.BankCore;
import kz.dulatibrayev.solidbankapp.cli.interfaces.CreateAccountOperationUI;
import kz.dulatibrayev.solidbankapp.interfaces.AccountListingService;

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

	void createAccountRequest(String clientID) {

	}

	void getAccounts(String clientID) {

	}

}
