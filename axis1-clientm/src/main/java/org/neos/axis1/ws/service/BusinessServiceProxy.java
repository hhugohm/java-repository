package org.neos.axis1.ws.service;

public class BusinessServiceProxy implements org.neos.axis1.ws.service.BusinessService {
  private String _endpoint = null;
  private org.neos.axis1.ws.service.BusinessService businessService = null;
  
  public BusinessServiceProxy() {
    _initBusinessServiceProxy();
  }
  
  public BusinessServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBusinessServiceProxy();
  }
  
  private void _initBusinessServiceProxy() {
    try {
      businessService = (new org.neos.axis1.ws.service.BusinessServiceServiceLocator()).getBusinessService();
      if (businessService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)businessService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)businessService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (businessService != null)
      ((javax.xml.rpc.Stub)businessService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.neos.axis1.ws.service.BusinessService getBusinessService() {
    if (businessService == null)
      _initBusinessServiceProxy();
    return businessService;
  }
  
  public java.lang.String getMessageService(java.lang.String name) throws java.rmi.RemoteException{
    if (businessService == null)
      _initBusinessServiceProxy();
    return businessService.getMessageService(name);
  }
  
  
}