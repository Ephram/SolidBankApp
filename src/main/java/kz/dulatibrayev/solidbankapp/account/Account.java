package kz.dulatibrayev.solidbankapp.account;

import kz.dulatibrayev.solidbankapp.enums.AccountType;

public class Account {
	private AccountType accountType;
	private String id;
	private String clientID;
	private double balance;
	private boolean withdrawAllowed;
	private String accountNumber;

	public double getBalance() {
		return balance;
	}

	private void format() {
		accountNumber = String.format("%03d%06d", 1, Integer.valueOf(id));
	}

	@Override
	public String toString() {

		return "Account [id=" + accountNumber + ", clientID=" + clientID + ", balance=" + balance + "]";
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public Account(AccountType accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
		this.accountType = accountType;
		this.id = id;
		this.clientID = clientID;
		this.balance = balance;
		this.withdrawAllowed = withdrawAllowed;
		format();
	}

	public boolean isWithdrawAllowed() {
		return withdrawAllowed;
	}

	public void setWithdrawAllowed(boolean withdrawAllowed) {
		this.withdrawAllowed = withdrawAllowed;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
