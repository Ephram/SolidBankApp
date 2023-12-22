package kz.dulatibrayev.solidbankapp;

import kz.dulatibrayev.solidbankapp.interfaces.AccountCreationService;
import kz.dulatibrayev.solidbankapp.interfaces.AccountType;

public class BankCore {
	private static long id = 1;
	private long lastAccountNumber = 1;
	private AccountCreationService accountCreation;

	public BankCore(AccountCreationService accountCreation) {
		this.accountCreation = accountCreation;

	}

	void createNewAccount(AccountType accountType, String clientID) {
		
	}

	void incrementLastAccountNumber() {

	}
	
	
	
	public static long getId() {
		return id;
	}

	public static void setId(long id) {
		BankCore.id = id;
	}

	public long getLastAccountNumber() {
		return lastAccountNumber;
	}

	public void setLastAccountNumber(long lastAccountNumber) {
		this.lastAccountNumber = lastAccountNumber;
	}

	public AccountCreationService getAccountCreation() {
		return accountCreation;
	}

	public void setAccountCreation(AccountCreationService accountCreation) {
		this.accountCreation = accountCreation;
	}

}
