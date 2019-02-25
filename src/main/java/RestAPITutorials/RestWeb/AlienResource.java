package RestAPITutorials.RestWeb;

import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.Past;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	AlienRepository alienRepo= new AlienRepository();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien() {
		return alienRepo.getAliens();
	}
	
	@POST
	@Past()
	public Alien createAlien(Alien alien) {
		
		alienRepo.create(alien);
		return alien;
		
	}

}
