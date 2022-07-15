package frame;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class JlistExample {
	JlistExample(){
		JFrame f = new JFrame();
		DefaultListModel<String> ll = new DefaultListModel<>();
		ll.addElement("Item 1");
		ll.addElement("Item 2");
		ll.addElement("Item 3");
		ll.addElement("Item 4");
		
		JList<String> list = new JList<>(ll);
		list.setBounds(100, 100, 75, 75);
		f.add(list);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new JlistExample();
	}

}
