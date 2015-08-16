/**
 * BusinessService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.neos.axis1.ws.service;

public interface BusinessService_PortType extends java.rmi.Remote {
    public java.lang.String getMessageService(java.lang.String name) throws java.rmi.RemoteException;
    public float celsiusToFarenheit(float celsius) throws java.rmi.RemoteException;
    public float farenheitToCelsius(float farenheit) throws java.rmi.RemoteException;
    public double factorial(int farenheit) throws java.rmi.RemoteException;
}
