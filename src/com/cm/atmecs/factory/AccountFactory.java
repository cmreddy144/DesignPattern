package com.cm.atmecs.factory;

public class AccountFactory
{

	public static Account getAccount(String type, int accNo, String accName, double accBalance)
	{
		if("Savings".equalsIgnoreCase(type))
			return new SavingsAccount(accNo, accName, accBalance);
		else if("Current".equalsIgnoreCase(type))
			return new CurrentAccount(accNo, accName, accBalance);
			
		return null;
	}

}
