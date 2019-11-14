package com.cm.atmecs.strategy;

public class CreditCardStrategy implements PaymentStrategy
{
	private String name;
	private String cardNumber;
	private String cvv;
	private String expiryDate;
	
	public CreditCardStrategy(String name, String cardNumber, String cvv, String expiryDate)
	{
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	@Override
	public void pay(double amount)
	{
		System.out.println(amount+ " paid with Credit Card");
		
	}

}
