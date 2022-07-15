package frame;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ScrollBarExample {
	
	public ScrollBarExample() {
		JFrame frame = new JFrame("Scroll Bar Example");
		
		JTextArea area = new JTextArea(20, 20);
//		area.setBounds(50, 50, 200, 200);
		JScrollPane pane = new JScrollPane(area);
		pane.setSize(200, 200);
		pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(pane);
		
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ScrollBarExample();
	}

}
