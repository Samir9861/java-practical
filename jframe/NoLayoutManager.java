package frame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class NoLayoutManager extends JFrame {
	 public static void main(String[] args) {
//		    JFrame.setDefaultLookAndFeelDecorated(true);
		    JFrame frame = new JFrame("NoLayout Login Page");
		    frame.setLayout(null);
		    JLabel login = new JLabel("Login ID:");
		    login.setBounds(20, 25, 100, 20);
		    JTextField textField = new JTextField();
		    textField.setBounds(124, 25, 100, 20);
		    frame.add(login);
		    frame.add(textField);
		    JLabel password = new JLabel("Password : ");
		    password.setBounds(20, 50, 100, 20);
		    JPasswordField passfield = new JPasswordField();
		    passfield.setBounds(124, 50, 100, 20);
		    frame.add(password);
		    frame.add(passfield);
		    JButton btn = new JButton("Submit");
		    btn.setBounds(60, 80, 100, 20);
		    frame.add(btn);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setSize(300, 300);
		    frame.setVisible(true);
		  }
}
