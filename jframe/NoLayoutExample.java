package frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutExample {
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("No layout");
		frame.setLayout(null);
		JButton btn1 = new JButton("First");
		btn1.setBounds(20,20,100,20);
		JButton btn2 = new JButton("second");
		btn2.setBounds(124,75,100,20);
		
		frame.add(btn1);
		frame.add(btn2);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
