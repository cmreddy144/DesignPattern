package com.cm.atmecs.strategy;

public class InternetBankingStrategy implements PaymentStrategy
{
	private String userId;
	private String password;
	
	public InternetBankingStrategy(String userId, String password)
	{
		this.userId = userId;
		this.password = password;
	}



	@Override
	public void pay(double amount)
	{
		System.out.println(amount + " paid with Internet Banking");
	}

}
