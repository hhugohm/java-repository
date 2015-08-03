package org.neos.axis1.ws.service;

/**
 * 
 * @author Hector Hugo Hidalgo
 * 03/08/2015
 *
 */
public class BusinessService implements IBusinessService {
	
	@Override
	public String getMessageService(String name){
		System.out.println("entrando en el webrsevice...");
		
		return "HELLO "+ name + "!, WELCOME TO WEBSERVICE AXIS1 ";
		
	}

}
