package com.vogella.jersey.first;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


//setting the path to baseURL+path(/hello)
@Path("/hello")
public class hello {

	
@GET
@Produces(MediaType.TEXT_PLAIN)
public String sayPlainTextHello(){
	
	return "hello Jersey";
	
	
}


@GET
@Produces(MediaType.TEXT_XML)
public String sayXMLHello() {

	return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";


}
//This method is called if HTML is request
@GET
@Produces(MediaType.TEXT_HTML)
public String sayHtmlHello() {
 return "<html> " + "<title>" + "Hello Jersey" + "</title>"
     + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
}










}
