package com.cm.atmecs.businessdeligate;

public class BusinessDeligate
{
	private BusinessService businessService;
	private BusinessLookup lookupService = new BusinessLookup();
	private String serviceType;
	
	public void setServiceType(String serviceType)
	{
		this.serviceType = serviceType;
	}
	
	public void doTask()
	{
		businessService = lookupService.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}
