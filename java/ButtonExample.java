import javax.swing.*;
	public class ButtonExample{
		public static void main(String[] args){
			JFrame f = new JFrame("Button Example");
				JButton btn = new JButton("touchMe");
					btn.setBounds(50,100,95,30);
	f.add(btn);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);

		}
	}