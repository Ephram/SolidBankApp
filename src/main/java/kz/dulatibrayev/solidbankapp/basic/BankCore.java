package kz.dulatibrayev.solidbankapp.basic;

import kz.dulatibrayev.solidbankapp.interfaces.AccountCreationService;
import kz.dulatibrayev.solidbankapp.interfaces.AccountType;

public class BankCore {
	static long id = 1;
	long lastAccountNumber = 1;
	AccountCreationService accountCreation;

	public BankCore(AccountCreationService accountCreation) {
		// TODO Auto-generated constructor stub
	}

	void createNewAccount(AccountType accountType, String clientID) {

	}

	void incrementLastAccountNumber() {

	}

}
