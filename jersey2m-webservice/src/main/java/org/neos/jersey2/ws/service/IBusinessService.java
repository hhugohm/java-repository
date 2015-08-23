package org.neos.jersey2.ws.service;


import org.neos.domain.Product;

public interface IBusinessService {
	
	public String getMessageService(String name);
	
	 Product getProduct( String id);

}
