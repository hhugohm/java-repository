package org.neos.jersey2.ws.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.neos.domain.Product;
import org.neos.ws.business.IMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("businessService")
@Path("/businessService")
public class BusinessService implements IBusinessService{
	
	@Autowired
	private IMessages imessages;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/product/{id}")
	public Product getProduct(@PathParam("id") String id) {
		Product p = new Product();
		p.setId("1561");
		p.setName(imessages.getMessageItem());
		return p;
	}
	

	@Override
	@GET
	@Path("/{param}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessageService(@PathParam("param")String name){
		System.out.println("entrando en el webrsevice...otro comentario");
		
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
	  public String sayHtmlHello() {
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	  }

}
