package kz.dulatibrayev.solidbankapp.basic;

import java.util.List;

import kz.dulatibrayev.solidbankapp.interfaces.AccountListingService;
import kz.dulatibrayev.solidbankapp.interfaces.AccountType;

public class AccountListingServiceImpl implements AccountListingService {

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
		// TODO Auto-generated method stub
		return null;
	}

}
