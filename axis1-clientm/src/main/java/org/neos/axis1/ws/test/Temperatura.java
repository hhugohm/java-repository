package org.neos.axis1.ws.test;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;


import org.neos.axis1.ws.service.BusinessServiceSoapBindingStub;

public class Temperatura {
	 public static void main(String[] args) 
				throws ServiceException, RemoteException, MalformedURLException {  
	  
		 
		 java.net.URL endPointURL= new java.net.URL("http://localhost:8080/axis1m-webservice/services/BusinessService");
			
			org.apache.axis.client.Service service = new org.apache.axis.client.Service();
			BusinessServiceSoapBindingStub stub = new BusinessServiceSoapBindingStub(endPointURL,service);

	 System.out.println("25.5 grados Celcius= "
			 + stub.celsiusToFarenheit(25.5f)+" grados Farenheit");
}  
}
