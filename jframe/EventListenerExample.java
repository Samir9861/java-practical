package frame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventListenerExample extends JFrame implements ActionListener {
	JButton btn1, btn2;
	JTextField area;
	public EventListenerExample() {
		btn1 = new JButton("Clicked");
		btn2 = new JButton("Pressed");
		area = new JTextField("Example for Action Listener");
		btn1.setActionCommand("Hello");
		btn2.setActionCommand("Bye BYe");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		
		add(area);
		add(btn1);
		add(btn2);
		setSize(500,500);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Hello")) {
			area.setText("I am Clicked!!!");
		}
		else if(e.getActionCommand().equals("Bye BYe")) {
			area.setText("I am Pressed!!!!");
		}
		
	}
	
	public static void main(String[] args) {
		new EventListenerExample();
	}
	
}
