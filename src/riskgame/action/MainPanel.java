package riskgame.action;

import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @author Admin
 * This is the panel for map editor
 *
 */
public class MainPanel extends JPanel {
	
	private JButton button1;
	private JButton button2;

	public MainPanel() {
		super();
		setLayout(null);
		button1=new JButton("map editor");
		button1.setBounds(280, 100, 400, 100);
		button2=new JButton("strat game");
		button2.setBounds(280, 280, 400, 100);
		add(button1);
		add(button2);
	}

	
	
	
	
}
