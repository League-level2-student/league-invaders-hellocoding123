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
		
		for(int i = 0; i < projectiles.size(); i++ ) {
			projectiles.get(i).update();
		}
	}
	
	void addAlien() {
		
		aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
		
	}
	
	void update() {
		
		for(int i = 0; i < aliens.size(); i++ ) {
			aliens.get(i).update();
			
			if(aliens.get(i).y < LeagueInvaders.HEIGHT || aliens.get(i).y > 0) {
				aliens.get(i).isActive = false;
			}
		}
		
		for(int i = 0; i < projectiles.size(); i++ ) {
			projectiles.get(i).update();
		}
	}
}
//sfggggggggggggggggggggggggggggg