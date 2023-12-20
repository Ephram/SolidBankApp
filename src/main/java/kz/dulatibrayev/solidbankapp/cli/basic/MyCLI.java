package kz.dulatibrayev.solidbankapp.cli.basic;

import java.util.Scanner;

import kz.dulatibrayev.solidbankapp.cli.interfaces.CLIUI;
import kz.dulatibrayev.solidbankapp.interfaces.AccountType;

public class MyCLI implements CLIUI {
	Scanner scanner;

	public MyCLI(Scanner scanner) {

	}

	double requestClientAmount() {
		return 0;
	}

	String requestClientAccountNumber() {
		return null;
	}

	AccountType requestAccountType() {
		return null;
	}

}
