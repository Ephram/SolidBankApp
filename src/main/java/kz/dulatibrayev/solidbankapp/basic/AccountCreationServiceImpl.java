package kz.dulatibrayev.solidbankapp.basic;

import kz.dulatibrayev.solidbankapp.interfaces.AccountCreationService;
import kz.dulatibrayev.solidbankapp.interfaces.AccountDAO;
import kz.dulatibrayev.solidbankapp.interfaces.AccountType;

public class AccountCreationServiceImpl implements AccountCreationService {
	private AccountDAO accountDAO;

	public AccountCreationServiceImpl(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	@Override
	public void create(AccountType accountType, long bankID, String clientID, long accountID) {
		// TODO Auto-generated method stub

	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

}
