/**
 * BusinessServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.neos.axis1.ws.service;

public interface BusinessServiceService extends javax.xml.rpc.Service {
    public java.lang.String getBusinessServiceAddress();

    public org.neos.axis1.ws.service.BusinessService_PortType getBusinessService() throws javax.xml.rpc.ServiceException;

    public org.neos.axis1.ws.service.BusinessService_PortType getBusinessService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
