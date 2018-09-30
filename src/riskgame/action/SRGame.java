package riskgame.action;
/**
 * 
 * @author Admin
 *This is where game start
 */

import javax.swing.JFrame;

public class SRGame 
{
	
	public static void main(String[] args) 
	{
		JFrame frame=new JFrame("Risk");
		MainPanel mainPanel=new MainPanel(); //initional map
		
		frame.add(mainPanel);
		frame.setSize(1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

	

}
