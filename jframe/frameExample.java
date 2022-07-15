package frame;

import javax.swing.JButton;
import javax.swing.JFrame;

//import javax.swing.*;

public class frameExample {
	public static void main(String[] args) {
		JFrame f = new JFrame("Button Example");
		JButton btn = new JButton("Click Here");
		btn.setBounds(50,100,95,30);
		f.add(btn);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);	
	}
	

}
