package com.cm.atmecs.abstractfactory;

public class AccountFactory
{

	public static Account getAccount(AccountAbstractFactory abf)
	{
		return abf.createAccount();
	}
}
