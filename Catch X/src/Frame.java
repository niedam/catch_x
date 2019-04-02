import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.Container;
import java.awt.Dimension;

import java.util.Random;


public class Frame extends JFrame implements ActionListener {

	private Button_agent X_agent;
	public Container pane;
	private Random generator;
	
	public Frame() {
		//Configure frame
		super("Catch X");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setMinimumSize(new Dimension (500, 500));
		
		//Configure container
		pane = getContentPane();
		pane.setLayout(null);
		
		//Configure button with X and add them to container
		X_agent = new Button_agent();
		X_agent.addActionListener(this);
		pane.add(X_agent);
		
		//Set generator of random number
		generator = new Random();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == X_agent) {
			int new_x = generator.nextInt(pane.getWidth() - X_agent.getAgentSize());
			int new_y = generator.nextInt(pane.getHeight() - X_agent.getAgentSize());
			X_agent.changePosition(new_x, new_y);
		}
	}
	
}
