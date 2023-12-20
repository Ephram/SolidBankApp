package kz.dulatibrayev.solidbankapp.cli.basic;

import kz.dulatibrayev.solidbankapp.basic.BankCore;
import kz.dulatibrayev.solidbankapp.cli.interfaces.CreateAccountOperationUI;
import kz.dulatibrayev.solidbankapp.interfaces.AccountListtingService;

public class AccountBasicCLI {
	CreateAccountOperationUI createAccountOperationUI;
	BankCore bankCore;
	AccountListtingService accountListing;

	public AccountBasicCLI(CreateAccountOperationUI accountOperationUI, BankCore bankCore,
			AccountListtingService accountListtingService) {

	}

	void createAccountRequest(String clientID) {

	}

	void getAccounts(String clientID) {

	}
	
	
}
