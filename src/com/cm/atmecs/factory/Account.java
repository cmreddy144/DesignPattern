package com.cm.atmecs.factory;

public abstract class Account
{
	public abstract int getAccNo();
	public abstract String getAccName();
	public abstract double getAccBalance();
	@Override
	public String toString()
	{
		return "Account [getAccNo()=" + getAccNo() + ", getAccName()=" + getAccName() + ", getAccBalance()="
				+ getAccBalance() + "]";
	}	
}


