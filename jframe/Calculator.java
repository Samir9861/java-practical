package frame;
import javax.swing.*;

public class Calculator {
	public static void main(String[] args) {
	    JFrame f = new JFrame("Calculator");

	    // JPanel f = new JPanel();
	   
	    JTextField t1;
	    t1=new JTextField();
	    t1.setBounds(30, 15, 235,35);
	    f.add(t1);

	    JButton btn0 = new JButton("0");
	    btn0.setBounds(30,195,110,35);
	    f.add(btn0);
	    JButton btn1 = new JButton("1");
	    btn1.setBounds(30,150,50,35);
	    f.add(btn1);
	    JButton btn2 = new JButton("2");
	    btn2.setBounds(90,150,50,35);
	    f.add(btn2);
	    JButton btn3 = new JButton("3");
	    btn3.setBounds(150,150,50,35);
	    f.add(btn3);
	    JButton btn4 = new JButton("4");
	    btn4.setBounds(30,105,50,35);
	    f.add(btn4);
	    JButton btn5 = new JButton("5");
	    btn5.setBounds(90,105,50,35);
	    f.add(btn5);
	    JButton btn6 = new JButton("6");
	    btn6.setBounds(150,105,50,35);
	    f.add(btn6);
	    JButton btn7 = new JButton("7");
	    btn7.setBounds(30,60,50,35);
	    f.add(btn7);
	    JButton btn8 = new JButton("8");
	    btn8.setBounds(90,60,50,35);
	    f.add(btn8);
	    JButton btn9 = new JButton("9");
	    btn9.setBounds(150,60,50,35);
	    f.add(btn9);
	    JButton btn10 = new JButton("=");
	    btn10.setBounds(150,195,50,35);
	    f.add(btn10);
	    JButton btn11 = new JButton("+");
	    btn11.setBounds(210,200,50,30);
	    f.add(btn11);
	    JButton btn12 = new JButton("-");
	    btn12.setBounds(210,165,50,25);
	    f.add(btn12);
	    JButton btn13 = new JButton("*");
	    btn13.setBounds(210,130,50,25);
	    f.add(btn13);
	    JButton btn14 = new JButton("/");
	    btn14.setBounds(210,95,50,25);
	    f.add(btn14);
	    JButton btn15 = new JButton("C");
	    btn15.setBounds(210,60,50,25);
	    f.add(btn15);
	    // f.setSize(400,400);
	    // f.setLayout(null);
	    // frame.add(f);
	    f.setSize(300,300);
	    f.setLayout(null);
	    f.setVisible(true);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	}
	
