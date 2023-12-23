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
	public void create(AccountType accountType, String bankID, String clientID, long accountID) {

		switch (accountType) {
		case CHECKING:
			accountDAO.createNewAccount(new CheckingAccount(accountType, bankID, clientID, 0.0, true));
			break;
		case SAVING:
			accountDAO.createNewAccount(new SavingAccount(accountType, bankID, clientID, 0.0, true));
			break;
		case FIXED:
			accountDAO.createNewAccount(new FixedAccount(accountType, bankID, clientID, 0.0, false));
			break;
		default:
			System.out.println("wrong input");
			break;
		}

	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

}
