import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	boolean isAlive;
	
	GameObject (int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		isAlive = true;
	}
	
	void update() {
		//x = x + 10;
	}
	
	void draw(Graphics g){
		//g.fillRect(x, y, width, height);
	        }
}
