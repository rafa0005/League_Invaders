import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueInvaders {
	public class GamePanel extends JPanel implements ActionListener
	{
		

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			// TODO Auto-generated method stub
			


		} }
		JFrame frame;
		GamePanel panel;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	
	public LeagueInvaders() {
		frame = new JFrame();
		panel = new GamePanel();
	}
	void setup() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
