package org.neos.axis1.ws.test;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import javax.xml.namespace.QName;

public class TestTemperaturaCall {

	public static void main(String[] args) {
		try {
			String endpoint = 
			"http://localhost:8080/axis1m-webservice/services/BusinessService";

			Service service = new Service();
			Call call = (Call) service.createCall();

			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			call.setOperationName(
				 new QName("urn:org.neos.axis1.service", "getMessageService"));

			String ret = (String) call.invoke(new Object[] { "HUGO" });

			System.out.println(ret);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

}
