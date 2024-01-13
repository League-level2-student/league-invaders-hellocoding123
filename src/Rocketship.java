import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{
	
	public boolean right = false;
	public boolean left = false;
	public boolean up = false;
	public boolean down = false;

	public Rocketship(int x, int y, int width, int height) {
		
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		speed = 10;
	}
	
	void draw(Graphics g) {
		
		g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
	}
	
	public void update() {
		if (right && x < LeagueInvaders.WIDTH - width) {
			right();
		}
		
		if (left && x > 0) {
			left();
		}
		
		if (up && y > 0) {
			up();
			System.out.println(y);
		}
		
		if (down && y < LeagueInvaders.HEIGHT - height) {
			down();
		}
	}
	
	public void right() {
        x+=speed;
    }
	
	public void left() {
        x-=speed;
    }
	
	public void up() {
        y-=speed;
    }
	
	public void down() {
        y+=speed;
    }

}
