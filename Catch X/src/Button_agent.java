import javax.swing.JButton;

public class Button_agent extends JButton {	
	
	private static int size = 45;
	
	public Button_agent() {
		super("X");
		setBounds(10, 20, size, size);
	}
	
	public void changePosition(int x, int y) {
		setBounds(x, y, size, size);
	}
	
	public int getAgentSize() {
		int result = size;
		return result;
	}
	
}
