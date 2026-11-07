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
    	   frameDraw = new Timer(1000/60, this);
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
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END){
		    updateEndState();
		}
		
		repaint();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) {
		        currentState = MENU;
		    } else {
		        currentState++;
		    }
		    if (e.getKeyCode()==KeyEvent.VK_UP) {
		        System.out.println("UP");
		    }
		    if (e.getKeyCode()==KeyEvent.VK_DOWN) {
		        System.out.println("DOWN");
		    }
		    if (e.getKeyCode()==KeyEvent.VK_LEFT) {
		        System.out.println("LEFT");
		    }
		    if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
		        System.out.println("RIGHT");
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
