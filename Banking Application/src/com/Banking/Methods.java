package com.Banking;

import java.util.Scanner;

public class Methods extends Properties {
	Scanner scanner = new Scanner(System.in);

	public Methods(int accountNumber) {
		super.accountNumber = accountNumber;
	}

	public void balanceCheck() {
		System.out.println("Your balance is " + super.BALANCE);

	}

	public void cashWithdraw() {
		System.out.println("1.By Cash\n2.By Cheque\n3.ATM");
		int option = scanner.nextInt();
		switch (option) {
		case 1: {
			System.out.println("Enter Amount :");
			super.amount = scanner.nextInt();
			super.BALANCE = super.BALANCE - super.amount;
			balanceCheck();
			break;
		}
		case 2: {
			System.out.println("Enter cheque Number : ");
			int chequeNumber = scanner.nextInt();
			if (chequeNumber > 101 & chequeNumber <= 150) {
				System.out.println("Enter Amount :");
				super.amount = scanner.nextInt();
				super.BALANCE = super.BALANCE - super.amount;
				balanceCheck();
			} else
				System.out.println("WRONG CHEQUE NUMBER.....");
			break;
		}
		case 3: {
			System.out.println("Enter PIN Number : ");
			int pinNumber = scanner.nextInt();
			if (pinNumber == 6494) {
				System.out.println("Enter Amount :");
				super.amount = scanner.nextInt();
				super.BALANCE = super.BALANCE - super.amount;
				balanceCheck();
			} else
				System.out.println("INVALID PIN NUMBER!!");
			break;
		}
		default:
			System.out.println("WRONG INPUT!!");
		}

	}

	public void cashDeposite() {
		System.out.println("1.By Cash\n2.By Cheque");
		int option = scanner.nextInt();
		switch (option) {
		case 1: {
			System.out.println("Enter Amount :");
			super.amount = scanner.nextInt();
			super.BALANCE = super.BALANCE + super.amount;
			balanceCheck();
			break;
		}
		case 2: {
			System.out.println("Enter cheque Number : ");
			int chequeNumber = scanner.nextInt();
			if (chequeNumber > 101 & chequeNumber <= 150) {
				System.out.println("Enter Amount :");
				super.amount = scanner.nextInt();
				super.BALANCE = super.BALANCE + super.amount;
				balanceCheck();
			} else
				System.out.println("WRONG CHEQUE NUMBER.....");
			break;
		}
		default:
			System.out.println("WRONG INPUT!!");
		}
	}

	public void InternetBanking() {
		System.out.println("1. Balance Check\n2. Money Transfer");
		int InternetBankingOption = scanner.nextInt();
		switch (InternetBankingOption) {
		case 1: {
			balanceCheck();
			break;
		}
		case 2: {
			System.out.println("Enter Account Number : ");
			String accountNumber = scanner.next();
			if (accountNumber.length() == 5) {
				System.out.println("Enter Ammount : ");
				super.amount = scanner.nextInt();
				super.BALANCE = super.BALANCE - super.amount;
				balanceCheck();
			} else
				System.out.println("WRONG ACCOUNT NUMBER!!");
		}
		}
	}

}
