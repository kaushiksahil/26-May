package com.Banking;

public abstract class Properties {
	protected int accountNumber;
	protected String name;
	public static int BALANCE = 10000;
	protected int amount;

	public abstract void balanceCheck();

	public abstract void cashWithdraw();

	public abstract void cashDeposite();

	public abstract void InternetBanking();
}
