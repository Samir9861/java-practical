package frame;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class JDesktopPaneExample {
	public JDesktopPaneExample() {
		JFrame frame = new JFrame("Desktop pane Example");
		Container container = frame.getContentPane();
		JDesktopPane pane = new JDesktopPane();
		int number = 3, x=30, y=30;
		
		for(int i=0; i<number;i++) {
			JInternalFrame internalFrame = new JInternalFrame("InternalFrame"+(i+1), true,true,true,true);
			internalFrame.setBounds(x, y, 250, 100);
			internalFrame.add(new JButton("Submit"+i));
			pane.add(internalFrame);
			internalFrame.setVisible(true);
			y=y+100;
			
		}
		container.add(pane,BorderLayout.CENTER);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JDesktopPaneExample();
	}
}
