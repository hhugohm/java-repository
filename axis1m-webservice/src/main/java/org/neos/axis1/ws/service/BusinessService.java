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
		
		return "HELLO "+ name + "!, WELCOME TO WEBSERVICE AXIS1 hola";
		
	}
	@Override
	public float celsiusToFarenheit(float celsius) {
		return (celsius * 1.8f+32);
	}

	@Override
	public float farenheitToCelsius(float farenheit) {
		return ((farenheit -32)* 5/9);
	}
	
	@Override
	public double factorial(int number) {
		 if (number <= 1)
	            return 1;
	     else
	            return number * factorial(number - 1);
	}


}
