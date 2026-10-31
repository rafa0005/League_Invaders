import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel{
	final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    Font titleFont;
    Font subheading;
    int x = 30;
    int y = 60;
    int a = 120;
    int b = 300;
    int c = 500;
    int d = 70;
    Timer frameDraw;
    
    int currentState = MENU;
    void updateMenuState() {  }
    void updateGameState() {  }
    void updateEndState()  {  }
    void drawMenuState(Graphics g) { g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT); 
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("LEAGUE INVADERS", x, y);
	g.setFont(subheading);
	g.setColor(Color.YELLOW);
	g.drawString("Press ENTER to start", a, b);
	g.drawString("Press SPACE for instructions", d, c);	
	}
    void drawGameState(Graphics g) { g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT); }
    void drawEndState(Graphics g)  { g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT); }
    public GamePanel(){
    	 titleFont = new Font("Arial", Font.PLAIN, 48);
    	 subheading = new Font("TimesNewRoman", Font.PLAIN, 28);
    	   frameDraw = new Timer(1000/60,(ActionListener) this);
    	    frameDraw.start();

    }
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
		
		
		
	}
}
