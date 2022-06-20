import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RRR extends JFrame{
	JButton b1, b2;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2;
	int i, k;
	String a, b;
	
	public RRR(String s) {
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("Посчитать");
		b2 = new JButton("Очистить");
		l1 = new JLabel("Введите второе число");
		l2 = new JLabel("Введите первое число");
		l3 = new JLabel("");
		l4 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);		
		add(t1);
		add(l1);
		add(t2);
		add(l2);		
		add(l3);
		add(l4);
		add(b1);
		add(b2);		
	}
}

