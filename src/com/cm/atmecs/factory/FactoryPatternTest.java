package com.cm.atmecs.factory;

public class FactoryPatternTest
{

	public static void main(String[] args)
	{
		Account savingsAcc = AccountFactory.getAccount("Savings", 1234, "Rohith", 854785.05d);
		Account currentAcc = AccountFactory.getAccount("Current", 23456, "Veera", 98745622.32d);
		System.out.println("Factory Savings Account: config : " + savingsAcc );
		System.out.println("Factory Current Account: config : " + currentAcc );
	}

}
