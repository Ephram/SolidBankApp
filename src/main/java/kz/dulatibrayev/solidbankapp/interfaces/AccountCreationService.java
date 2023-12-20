package kz.dulatibrayev.solidbankapp.interfaces;

public interface AccountCreationService {
	void create(AccountType accountType, long bankID, String clientID, long accountID);
}
