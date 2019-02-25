package RestAPITutorials.RestWeb;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien() {
		System.out.println("alien");
		Alien a1=new Alien();
		a1.setName("Kiran");
		a1.setPoints(99);
		
		Alien a2=new Alien();
		a2.setName("Anil");
		a2.setPoints(98);
		
		List<Alien> aliens= Arrays.asList(a1,a2);
		
		return aliens;
	}

}
