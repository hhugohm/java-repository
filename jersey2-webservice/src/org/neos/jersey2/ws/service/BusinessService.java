package org.neos.jersey2.ws.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * @author Hector Hugo Hidalgo
 * 03/08/2015
 *
 */
@Path("/businessService")
public class BusinessService implements IBusinessService{

	@Override
	@GET
	@Path("/messageService/{param}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessageService(@PathParam("param")String name){
		System.out.println("entrando en el webrsevice...");
		
		return "HELLO "+ name + "!, WELCOME TO WEBSERVICE REST ";
		
	}
	// This method is called if TEXT_PLAIN is request
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello() {
	    return "Hello Jersey";
	  }
	
	// This method is called if XML is request
	  @GET
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHello() {
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	  }

	  // This method is called if HTML is request
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  @Path("/messageHTML")
	  public String sayHtmlHello() {
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	  }

}
