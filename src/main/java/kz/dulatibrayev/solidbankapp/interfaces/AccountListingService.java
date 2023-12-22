package kz.dulatibrayev.solidbankapp.interfaces;

import java.util.List;

import kz.dulatibrayev.solidbankapp.basic.Account;
import kz.dulatibrayev.solidbankapp.basic.AccountWithdraw;

public interface AccountListingService {
	Account getClientAccount(String clientID, String accountID);
	
	AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
	
	
	List<Account> getClientAccounts(String clientID);

	List<Account> getClientAccountsByType(String clientID, AccountType accountType);

	



}
