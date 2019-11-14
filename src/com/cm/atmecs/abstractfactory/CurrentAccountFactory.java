package com.cm.atmecs.abstractfactory;

public class CurrentAccountFactory implements AccountAbstractFactory
{
	private int accNo;
	private String accName;
	private double accBalance;
	
	public CurrentAccountFactory(int accNo, String accName, double accBalance)
	{
		this.accNo = accNo;
		this.accName = accName;
		this.accBalance = accBalance;
	}

	@Override
	public Account createAccount()
	{
		return new CurrentAccount(accNo, accName, accBalance);
	}

}
