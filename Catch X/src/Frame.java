import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Dimension;


public class Frame extends JFrame {

	
	private JButton X_agent;
	private JPanel panel;

	
	
	public Frame() {
		super("Catch X");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setMinimumSize(new Dimension (500, 500));
		
		panel = new JPanel();
		Dimension panel_size = panel.getSize();
		panel.setPreferredSize(new Dimension(40,40));
		System.out.println(panel_size.height);
		System.out.println(panel_size.width);
		
		
		X_agent = new JButton("X");
		X_agent.setVisible(true);
		X_agent.setPreferredSize(new Dimension(45,45));
		
		panel.add(X_agent);
		add(panel);
	}
	
	public void print_size() {
		System.out.println(panel.getSize());
	}
}
