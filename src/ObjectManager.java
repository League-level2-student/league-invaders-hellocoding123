import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {

	Rocketship rocket;
	ArrayList<Projectile> projectiles= new ArrayList<Projectile>();
	ArrayList<Alien> aliens= new ArrayList<Alien>();
	Random random = new Random();
	
	public ObjectManager(Rocketship rocket) {
		this.rocket = rocket;
	}
	
	void addProjectile(Projectile projectile) {
		
		projectiles.add(projectile);
	}
	
	void addAlien() {
		aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
	}
	
	void update() {
		
	}
	 /*
	 MODEL MANAGMENT STEP 5 (idk where to put loop):
	 
	for(int i = 0; i < aliens.size(); i++ ) {
		
	}
	*/
}
