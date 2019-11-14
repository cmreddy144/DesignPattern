package com.cm.atmecs.businessdeligate;

public class EjbService implements BusinessService
{

	@Override
	public void doProcessing()
	{
		System.out.println("Ejb Processing...");
	}
	

}
