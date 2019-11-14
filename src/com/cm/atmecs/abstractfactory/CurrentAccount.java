package com.cm.atmecs.abstractfactory;

public class CurrentAccount extends Account
{
	
	private int accNo;
	private String accName;
	private double accBalance;
	
	public CurrentAccount(int accNo, String accName, double accBalance)
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
