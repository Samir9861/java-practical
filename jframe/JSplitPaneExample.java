package frame;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class JSplitPaneExample {
	public JSplitPaneExample() {
		JFrame frame = new JFrame("split pane example");
		Container container = frame.getContentPane();
		
		String[] str1 = {"a","b", "c", "d", "e"};
		String[] str2 = {"A","B", "C", "D", "E"};
		
		JComboBox box1 = new JComboBox(str1);
		JComboBox box2 = new JComboBox(str2);
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(box1);
		panel1.add(new JButton("Click Me"));
		JPanel panel2 = new JPanel();
		panel2.add(box2);
		JSplitPane splitpane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, panel1, panel2);
		
		container.add(splitpane);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JSplitPaneExample();
	}
	
	
}
