package frame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample {
	JFrame f;
	JTableExample(){
		f = new JFrame();
		String data[][] = {
				{"101", "Aayush", "50000"},
				{"102", "Binaya", "40000"},
				{"103", "Dipendra", "60000"}
		};
		String column[] = {"ID", "NAME", "SALARY"};
		JTable jt = new JTable(data, column);
		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(jt);
		f.add(sp);
		f.setSize(300, 400);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTableExample();
	}
}
