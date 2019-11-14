package com.cm.atmecs.businessdeligate;

public class BusinessDeligatePatternDemo
{

	public static void main(String[] args)
	{
		BusinessDeligate bd = new BusinessDeligate();
		bd.setServiceType("JMS");
		Client cl = new Client(bd);
		cl.doTask();

		bd.setServiceType("EJB");
		cl.doTask();
				
	}

}
