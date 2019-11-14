package com.cm.atmecs.abstractfactory;

public class TestAbstractFactoryPattern
{

	public static void main(String[] args)
	{
		Account savingsAcc = AccountFactory.getAccount(new CurrentAccountFactory(1234, "Vihari", 21453.02d));
		Account currentAcc = AccountFactory.getAccount(new SavingsAccountFactory(23456, "Veera", 98745622.32d));
		System.out.println("Factory Savings Account: config : " + savingsAcc );
		System.out.println("Factory Current Account: config : " + currentAcc );
	}
}
