package kz.dulatibrayev.solidbankapp.basic;

import kz.dulatibrayev.solidbankapp.interfaces.AccountType;

public class SavingAccount extends AccountWithdraw {

	public SavingAccount(AccountType accountType, String id, String clientID, double balance, boolean withdrawAllowed) {
		super(accountType, id, clientID, balance, withdrawAllowed);
		// TODO Auto-generated constructor stub
	}

}
