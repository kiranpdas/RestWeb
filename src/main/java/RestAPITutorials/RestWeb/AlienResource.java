package RestAPITutorials.RestWeb;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	AlienRepository alienRepo= new AlienRepository();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens() {
		return alienRepo.getAliens();
	}
	
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien getAlien(@PathParam("id") int alienId) {
		return alienRepo.getAlien(alienId);
	}
	
	
	@POST
	@Path("alien")
	public Alien createAlien(Alien alien) {
		System.out.println(alien);
		alienRepo.create(alien);
		return alien;
		
	}

}
