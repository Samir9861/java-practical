import javax.swing.JFrame;
import javax.swing.JLabel;

public class PasswordFieldExample {
public static void main(String[] args) {
	JFrame f=new JFrame("password field example");
	
	JPasswordField value =new JPasswordField();
	JLabel l1=new jLabel("password:");
	l1.setBounds(20,100,80,30);
	
	value.setBounds(100,100,100,30);
	
	f.add(value);
	f.add(l1);
	f.setLayout(null);
	f.setvisible(true);
	
}
}
