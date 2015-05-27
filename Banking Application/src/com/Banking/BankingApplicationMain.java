package com.Banking;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankingApplicationMain {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("WELCOME TO THE BANKING SERVICE");
		System.out.println("Enter Account Number");
		Properties objectProperties = new Methods(Integer.parseInt(br
				.readLine()));
		System.out.println("What do you want.....");
		System.out
				.println("1. Balance Check \n2. Cash Withdrawl \n3. Cash Deposite \n4. Internet Banking");
		int choose = Integer.parseInt(br.readLine());
		switch (choose) {
		case 1: {
			objectProperties.balanceCheck();
			break;
		}
		case 2: {
			System.out.println("What do you want....");
			objectProperties.cashWithdraw();
			break;
		}
		case 3: {
			System.out.println("What do you want....");
			objectProperties.cashDeposite();
			break;
		}
		case 4: {
			objectProperties.InternetBanking();
		}
		default:
			System.out.println("WRONG INPUT!!");
		}

	}

}
