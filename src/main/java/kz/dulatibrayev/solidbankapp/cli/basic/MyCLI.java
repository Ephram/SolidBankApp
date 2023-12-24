package kz.dulatibrayev.solidbankapp.cli.basic;

import java.util.Scanner;

import kz.dulatibrayev.solidbankapp.cli.interfaces.CLIUI;
import kz.dulatibrayev.solidbankapp.enums.AccountType;

public class MyCLI implements CLIUI {
	private Scanner scanner;

	public MyCLI(Scanner scanner) {
		this.scanner = scanner;

	}

	public MyCLI() {
		this.scanner = new Scanner(System.in);
	}

	double requestClientAmount() {
		return 0;
	}

	String requestClientAccountNumber() {
		return null;
	}

	public AccountType requestAccountType() {
		return AccountType.valueOf(scanner.nextLine());
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

}
