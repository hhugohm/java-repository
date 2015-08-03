/**
 * BusinessServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.neos.axis1.ws.service;

@SuppressWarnings("serial")
public class BusinessServiceServiceLocator extends org.apache.axis.client.Service implements org.neos.axis1.ws.service.BusinessServiceService {

    public BusinessServiceServiceLocator() {
    }


    public BusinessServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BusinessServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BusinessService
    private java.lang.String BusinessService_address = "http://localhost:8080/axis1-webservice/services/BusinessService";

    public java.lang.String getBusinessServiceAddress() {
        return BusinessService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BusinessServiceWSDDServiceName = "BusinessService";

    public java.lang.String getBusinessServiceWSDDServiceName() {
        return BusinessServiceWSDDServiceName;
    }

    public void setBusinessServiceWSDDServiceName(java.lang.String name) {
        BusinessServiceWSDDServiceName = name;
    }

    public org.neos.axis1.ws.service.BusinessService getBusinessService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BusinessService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBusinessService(endpoint);
    }

    public org.neos.axis1.ws.service.BusinessService getBusinessService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.neos.axis1.ws.service.BusinessServiceSoapBindingStub _stub = new org.neos.axis1.ws.service.BusinessServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getBusinessServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBusinessServiceEndpointAddress(java.lang.String address) {
        BusinessService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @SuppressWarnings("rawtypes")
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.neos.axis1.ws.service.BusinessService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.neos.axis1.ws.service.BusinessServiceSoapBindingStub _stub = new org.neos.axis1.ws.service.BusinessServiceSoapBindingStub(new java.net.URL(BusinessService_address), this);
                _stub.setPortName(getBusinessServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @SuppressWarnings("rawtypes")
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BusinessService".equals(inputPortName)) {
            return getBusinessService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.ws.axis1.neos.org", "BusinessServiceService");
    }

    @SuppressWarnings("rawtypes")
	private java.util.HashSet ports = null;

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.ws.axis1.neos.org", "BusinessService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BusinessService".equals(portName)) {
            setBusinessServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
