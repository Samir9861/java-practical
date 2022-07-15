package frame;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class BoarderLayoutExample {
	
	public BoarderLayoutExample() {
		
		JFrame frame = new JFrame("Boarder Layout Example!!");
		frame.setLayout(new BorderLayout(10,10));
		JButton btn1 = new JButton("North");
		JButton btn2 = new JButton("South");
		JButton btn3 = new JButton("East");
		JButton btn4 = new JButton("West");
		JButton btn5 = new JButton("Center");
		
		frame.add(btn1, BorderLayout.NORTH);
		frame.add(btn2, BorderLayout.SOUTH);
		frame.add(btn3, BorderLayout.EAST);
		frame.add(btn4, BorderLayout.WEST);
		frame.add(btn5, BorderLayout.CENTER);
		
		frame.setSize(500,500);
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new BoarderLayoutExample();
	}

}
