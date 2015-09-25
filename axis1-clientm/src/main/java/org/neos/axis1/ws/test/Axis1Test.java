package org.neos.axis1.ws.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.client.Service;
import org.neos.axis1.constants.Constantsws;
import org.neos.axis1.ws.service.BusinessServiceSoapBindingStub;

/**
 * 
 * @author Hector Hidalgo
 * 23/09/2015
 * 
 * contiene la prueba de conexion con los servicios web
 *
 */
public class Axis1Test {

	public static void main(String[] args) throws RemoteException,
														MalformedURLException {
		
		URL endPointURL= new URL(Constantsws.wsdl_businessService);
		
		Service service = new Service();
		BusinessServiceSoapBindingStub stub = 
						new BusinessServiceSoapBindingStub(endPointURL,service);
		System.out.println(stub.getMessageService("HUGO"));
		
	}

}
