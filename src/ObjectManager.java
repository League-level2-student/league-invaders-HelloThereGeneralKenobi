import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {

	Rocketship rocket;
	ArrayList Projectile =  new ArrayList();
	
		ObjectManager(Rocketship rocket) {
			this.rocket = rocket;
		}
		
		void update() {
			rocket.update();
		}
		
		void draw(Graphics g) {
			rocket.draw(g);
		}
	
}
