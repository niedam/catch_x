import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;


public class Frame extends JFrame implements ActionListener {

	Button_agent X_agent;
	Container pane;
	
	public Frame() {
		super("Catch X");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setMinimumSize(new Dimension (500, 500));
		
		pane = getContentPane();
		pane.setLayout(null);
		
		X_agent = new Button_agent();
		X_agent.addActionListener(this);
		pane.add(X_agent);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		//
		if (source == X_agent) {
			X_agent.changePosition(80, 80);
		}
	}
	
}
