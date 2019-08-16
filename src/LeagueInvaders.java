import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	
	JFrame frame;
	final int width = 500;
	final int height = 800;
	Component GamePanel;
	
	public static void main(String[] args) {
		
		LeagueInvaders (JFrame frame) {
			
		}
		
		LeagueInvaders object = new LeagueInvaders();
		object.setup();
	}
		void setup() {
			frame = new JFrame();
			frame.add(GamePanel);
			frame.setVisible(true);
			frame.getContentPane().setPreferredSize(new Dimension(width, height));
			frame.pack();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
