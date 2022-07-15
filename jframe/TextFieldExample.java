package frame;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFieldExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JTextField Example");
		JTextField t1, t2;
		t1 = new JTextField("Welcome to java world");
		t1.setBounds(50, 100, 200, 30);
		t2 = new JTextField("Text Field Example");
		t2.setBounds(50, 150, 200, 30);
		frame.add(t1);
		frame.add(t2);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
