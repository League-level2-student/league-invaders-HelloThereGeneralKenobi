import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {

	Rocketship rocket;
	static ArrayList<Projectile> projectiles =  new ArrayList<Projectile>();
	ArrayList<Alien> aliens =  new ArrayList<Alien>();
	
		ObjectManager(Rocketship rocket) {
			this.rocket = rocket;
		}
		
		void update() {
			rocket.update();
			for(int i = 0; i < projectiles.size(); i++) {
				projectiles.get(i).update();
			}
		}
		
		void draw(Graphics g) {
			rocket.draw(g);
			for(int i = 0; i < projectiles.size(); i++) {
				projectiles.get(i).draw(g);
			}
		}
		
		static void addProjectile(Projectile projectile) {
			projectiles.add(projectile);
		}
		
		void addAlien(Alien alien) {
			aliens.add(alien);
		}
}
