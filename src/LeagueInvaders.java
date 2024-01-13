import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;

public class LeagueInvaders {
	
	JFrame frame;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	GamePanel gamePanel;
	
	
	public static void main(String[] args) {
		LeagueInvaders game = new LeagueInvaders();
		game.setup();
	}
	
	public LeagueInvaders() {
		frame = new JFrame();
		gamePanel = new GamePanel();
	}
	
	void setup() {
		frame.add(gamePanel);
		gamePanel.setPreferredSize(new Dimension (WIDTH, HEIGHT));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addKeyListener(gamePanel);
		frame.pack();
	}
}
