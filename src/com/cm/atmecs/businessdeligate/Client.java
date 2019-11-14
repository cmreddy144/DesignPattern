package com.cm.atmecs.businessdeligate;

public class Client
{
	BusinessDeligate businessService;
	
	public Client(BusinessDeligate businessService)
	{
		this.businessService = businessService;
	}
	
	public void doTask()
	{
		businessService.doTask();
	}

}
