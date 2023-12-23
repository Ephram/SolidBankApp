package kz.dulatibrayev.solidbankapp.interfaces;

public interface AccountCreationService {
	void create(AccountType accountType, String bankID, String clientID, long accountID);
}
