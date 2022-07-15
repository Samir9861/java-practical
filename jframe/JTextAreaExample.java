package frame;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextAreaExample {
	public JTextAreaExample() {
		JFrame frame = new JFrame();
		
		JTextArea area = new JTextArea("Java World");
//		area.setBounds(10, 30, 200, 200);
		area.setRows(10);
		area.setColumns(20);
		
		frame.add(area);
		frame.setSize(300, 300);
//		frame.setLayout(null);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new JTextAreaExample();
	}

}
