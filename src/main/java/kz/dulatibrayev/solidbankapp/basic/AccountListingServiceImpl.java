package kz.dulatibrayev.solidbankapp.basic;

import java.util.List;

import kz.dulatibrayev.solidbankapp.interfaces.AccountDAO;
import kz.dulatibrayev.solidbankapp.interfaces.AccountListingService;
import kz.dulatibrayev.solidbankapp.interfaces.AccountType;

public class AccountListingServiceImpl implements AccountListingService {
	private AccountDAO accountDAO;

	@Override
	public Account getClientAccount(String clientID, String accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getClientAccounts(String clientID) {
		return this.accountDAO.getClientAccounts(clientID);

	}

	@Override
	public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

}
