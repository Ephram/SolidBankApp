package kz.dulatibrayev.solidbankapp.interfaces;

import java.util.List;

import kz.dulatibrayev.solidbankapp.basic.Account;
import kz.dulatibrayev.solidbankapp.basic.AccountWithdraw;

public interface AccountDAO {
	List<Account> getClientAccounts(String clientID);

	void createNewAccount(Account account);

	void updateAccount(Account account);

	List<Account> getClientAccountsByType(String clientID, AccountType accountType);

	AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);

	Account getClientAccount(String clientID, String accountID);

}
