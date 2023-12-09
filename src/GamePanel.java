import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
    final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
	
    int currentState = MENU;
    
    Font titleFont;
    Font defaultFont;

    public GamePanel() {
    	titleFont = new Font("Arial", Font.PLAIN, 48);
    	defaultFont = new Font("Arial", Font.PLAIN, 20);
	}
    
	@Override
	public void paintComponent(Graphics g){
		
		if(currentState == MENU){
		    drawMenuState(g);
		}
		
		else if(currentState == GAME){
		    drawGameState(g);
		}
		
		else if(currentState == END){
		    drawEndState(g);
		}
	}
	
	void updateMenuState() { 
		 
	}
	void updateGameState() { 
		 
	}
	void updateEndState() { 
		 
	}
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("LEAGUE INVADERS",23, 100);
		
		g.setFont(defaultFont);
		g.drawString("Press ENTER To Start",152, 400);
		
		g.drawString("Press SPACE For Instructions",120, 500);
	}
	
	void drawGameState(Graphics g) { 
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}
	
	void drawEndState(Graphics g)  { 
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}
}
