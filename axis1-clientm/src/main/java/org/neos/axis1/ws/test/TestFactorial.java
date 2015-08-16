package org.neos.axis1.ws.test;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.neos.axis1.ws.service.BusinessServiceSoapBindingStub;

public class TestFactorial {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		 java.net.URL endPointURL= new java.net.URL("http://localhost:8080/axis1m-webservice/services/BusinessService");
			
			org.apache.axis.client.Service service = new org.apache.axis.client.Service();
			BusinessServiceSoapBindingStub stub = new BusinessServiceSoapBindingStub(endPointURL,service);
			 System.out.println("Factorial= "+ stub.factorial(10));
	

	}

}
