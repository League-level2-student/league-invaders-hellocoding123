import java.awt.Color;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	
    final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
	
    int currentState = MENU;
    
    Font titleFont;
    Font defaultFont;
    
    Timer frameDraw;
    
    Rocketship rocketship = new Rocketship(250,700,50,50);

    public GamePanel() {
    	titleFont = new Font("Arial", Font.PLAIN, 48);
    	defaultFont = new Font("Arial", Font.PLAIN, 20);
    	
	   	 frameDraw = new Timer(1000/60,this);
		 frameDraw.start();
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
		
		rocketship.draw(g);
	}
	
	void drawEndState(Graphics g)  { 
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("GAME OVER",94, 100);
		
		g.setFont(defaultFont);
		g.drawString("You Killed " + " Enemies",156, 400);
		
		g.drawString("Press ENTER To Restart",129, 500);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		 
		 if(currentState == MENU){
			 updateMenuState();
		 }
		 
		 else if(currentState == GAME){
			 updateGameState();
		 }
		 
		 else if(currentState == END){
			 updateEndState();
		 }
		 
		 //System.out.println("action");
		 repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			
		    if (currentState == END) {
		        currentState = MENU;
		    } 
		    
		    else {
		        currentState++;
		    }
		}   
		
		if (currentState == GAME) {
			
			if (e.getKeyCode()==KeyEvent.VK_UP) {
			    System.out.println("UP");
			    if (rocketship.y > 0) {
			    	rocketship.up();
				}
			}
			
			if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			    System.out.println("DOWN");
			    if (rocketship.y < 720) {
			    	rocketship.down();
			    }
			}
			
			if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			    System.out.println("LEFT");
			    if (rocketship.x > 0) {
			    	rocketship.left();
			    }
			}
			
			if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			    System.out.println("RIGHT");
			    if (rocketship.x < 450) {
			    	rocketship.right();
			    }
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
