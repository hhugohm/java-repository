package org.neos.axis1.ws.service;

public class BusinessService {
	
	public String getMessageService(String name){
		System.out.println("entrando en el webrsevice...");
		
		return "HELLO "+ name + " WELCOME TO WEBSERVICE AXIS1 ";
		
	}

}
