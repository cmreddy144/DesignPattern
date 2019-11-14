package com.cm.atmecs.businessdeligate;

public class BusinessLookup
{
	public BusinessService getBusinessService(String serviceType)
	{
		if(serviceType.equals("JMS"))
		{
			return new EjbService();
		}
		else if(serviceType.equals("EJB")))
		{
			return new EjbService();
		}
		return  null;
	}

}
