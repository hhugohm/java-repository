package org.neos.axis1.ws.service;

/**
 * 
 * @author Hector Hugo Hidalgo
 * 03/08/2015
 *
 */
public class BusinessService implements IBusinessService {
	
	public String getMessageService(String name){
		System.out.println("entrando en el webrsevice...");
		
		return "HELLO "+ name + "!, WELCOME TO WEBSERVICE AXIS1 hola";
		
	}
	
	public float celsiusToFarenheit(float celsius) {
		return (celsius * 9 / 5) + 32;
	}

	
	public float farenheitToCelsius(float farenheit) {
		return (farenheit - 32 / 1.8000f);
	}
	
	
	public double factorial(int number) {
		 if (number <= 1)
	            return 1;
	     else
	            return number * factorial(number - 1);
	}


}
