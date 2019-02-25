package RestAPITutorials.RestWeb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello() 
	{
		String resource="<? xml version='1.0' ?>"+
					"<hello>This is xml</hello>";
		return resource;
				
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJSON() 
	{
		String resource=null;
		return resource;
				
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML() 
	{
		String resource="<h1> This is html </h1>";
		return resource;
				
	}
	
}
