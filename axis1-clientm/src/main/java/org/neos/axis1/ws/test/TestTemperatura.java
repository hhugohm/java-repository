package org.neos.axis1.ws.test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.neos.axis1.ws.service.BusinessServiceServiceLocator;
import org.neos.axis1.ws.service.BusinessService_PortType;

public class TestTemperatura {

	public static void main(String[] args) throws ServiceException, 
															 RemoteException {

		BusinessServiceServiceLocator locator = 
											new BusinessServiceServiceLocator();
		BusinessService_PortType server = locator.getBusinessService();

		System.out.println(" 37 grados Celcius= " + 
						server.celsiusToFarenheit(37f) + " grados Farenheit");
		System.out.println("Farenheit= " + server.farenheitToCelsius(98.6f));
	}

}
