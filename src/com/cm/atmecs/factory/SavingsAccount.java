package com.cm.atmecs.factory;

public class SavingsAccount extends Account
{
	private int accNo;
	private String accName;
	private double accBalance;
	
	public SavingsAccount(int accNo, String accName, double accBalance)
	{
		this.accNo = accNo;
		this.accName = accName;
		this.accBalance = accBalance;
	}

	@Override
	public int getAccNo()
	{
		return this.accNo;
	}

	@Override
	public String getAccName()
	{
		return this.accName;
	}

	@Override
	public double getAccBalance()
	{
		return this.accBalance;
	}

}
