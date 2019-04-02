import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;


public class Frame extends JFrame {

	private JButton X_agent;
	private JPanel panel;
	
	public Frame() {
		super("Catch X");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		setMinimumSize(new Dimension (500, 500));
		
		Container pane = getContentPane();
		pane.setLayout(null);
		
		X_agent = new JButton("X");
		
		pane.add(X_agent);
		//pane.setBackground(Color.BLACK);
		
		
		Insets insets = pane.getInsets();
		
		X_agent.setBounds(10 + insets.left, 20 + insets.top, 45, 45);
		
	}
}
