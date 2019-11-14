package com.cm.atmecs.strategy;

public class TestStrategyPattern
{

	public static void main(String[] args)
	{
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("1234", 4656);
		Item item2 = new Item("5678", 1999);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		cart.pay(new CreditCardStrategy("cm", "132564484516", "456", "12/25"));
		cart.pay(new InternetBankingStrategy("8598865", "welcome1"));
		
		
	}

}
