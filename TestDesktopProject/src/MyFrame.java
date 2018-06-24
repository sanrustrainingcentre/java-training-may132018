import java.awt.Button;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		super("Test Window UI");
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
		JPanel panel = new JPanel();
		panel.add(new Button("Click Me"));
		
		frame.add(panel);
		
		frame.setSize(400, 500);
		frame.setVisible(true);
	}

}
