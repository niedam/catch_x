import java.awt.EventQueue;

public class CatchX {
	public static void main(String[] args) {
		System.out.println("Catch X if you can! It' s not so hard");
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Frame();
			}
		});
	}
}