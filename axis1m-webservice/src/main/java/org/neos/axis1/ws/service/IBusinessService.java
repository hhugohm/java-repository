package org.neos.axis1.ws.service;

/**
 * 
 * @author Hector Hugo Hidalgo
 * 03/08/2015
 *
 */
public interface IBusinessService {

	public String getMessageService(String name);
	
	public float celsiusToFarenheit(float celsius);
	
	public float farenheitToCelsius(float farenheit);
	
	public double factorial(int number);
}
