package RestAPITutorials.RestWeb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlienRepository {
	private List<Alien> aliens; ;
	
	public AlienRepository() {
		aliens = new ArrayList<>();
		
		Alien a1=new Alien();
		a1.setName("Kiran");
		a1.setPoints(99);
		
		aliens.add(a1);
		
		Alien a2=new Alien();
		a2.setName("Anil");
		a2.setPoints(98);
		
		aliens.add(a2);
		
		
	}
	
	public List<Alien> getAliens(){
		return this.aliens;
	}
	
	public Alien getAlien(String name) {
		
		for(Alien alien : this.aliens) {
			if(alien.getName().equals(name)) return alien;
		}
		
		return null;
	}

	public void create(Alien alien) {
		this.aliens.add(alien);
		
	}
	
}
