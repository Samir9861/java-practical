package frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class JPasswordFieldExample {
	public static void main(String[] args) {
		JFrame f = new JFrame("password field example");
		
		JPasswordField value = new JPasswordField();
		JLabel lab = new JLabel("Enter Password");
		lab.setBounds(20, 100, 80, 30);
		value.setBounds(100, 100, 100, 30);
		
		f.add(value);
		f.add(lab);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
