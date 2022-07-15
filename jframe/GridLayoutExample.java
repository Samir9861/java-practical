package frame;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExample {
	public GridLayoutExample() {
		JFrame frame = new JFrame("Grid Layout Example");
		
		JButton btn1 = new JButton("one");
		JButton btn2 = new JButton("two");
		JButton btn3 = new JButton("three");
		JButton btn4 = new JButton("four");
		JButton btn5 = new JButton("five");
		JButton btn6 = new JButton("six");
		JButton btn7 = new JButton("seven");
		JButton btn8 = new JButton("Eight");
		JButton btn9 = new JButton("Nine");
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
		
		
		
		frame.setSize(500,500);
//		frame.setLayout(new GridLayout(3,3,20,20));
		frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GridLayoutExample();
	}

}

//assignment----Gridbag Layout
