package com.cm.atmecs.abstractfactory;

public class SavingsAccountFactory implements AccountAbstractFactory
{
	private int accNo;
	private String accName;
	private double accBalance;
	
	public SavingsAccountFactory(int accNo, String accName, double accBalance)
	{
		this.accNo = accNo;
		this.accName = accName;
		this.accBalance = accBalance;
	}

	@Override
	public Account createAccount()
	{
		return new SavingsAccount(accNo, accName, accBalance);
	}

}
