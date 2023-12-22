package kz.dulatibrayev.solidbankapp.basic;

import java.util.List;

import kz.dulatibrayev.solidbankapp.interfaces.AccountDAO;
import kz.dulatibrayev.solidbankapp.interfaces.AccountType;

public class MemoryAccountDAO implements AccountDAO {
	private List<Account> accountList;

	@Override
	public List<Account> getClientAccounts(String clientID) {
		return null;
	}

	@Override
	public void createNewAccount(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAccount(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getClientAccount(String clientID, String accountID) {
		// TODO Auto-generated method stub
		return null;
	}

}
