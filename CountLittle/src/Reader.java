import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame{
	JButton b1, b2;
	JLabel l1, l2, l3, l4, l5, l6;
	JTextField t1, t2;
	int i, k, s1, s2, s3;
	double s4;
	String a, b, c, d;
	eHandler handler = new eHandler();
	
	public Reader(String s) {
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("Посчитать");
		b2 = new JButton("Очистить");
		l1 = new JLabel("Введите первое число");
		l2 = new JLabel("Введите второе число");
		l3 = new JLabel("");
		l4 = new JLabel("");
		l5 = new JLabel("");
		l6 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);		
		add(l1);
		add(t1);
		add(l2);
		add(t2);		
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(b1);
		add(b2);
		b1.addActionListener(handler);
		b2.addActionListener(handler);		
	}
	
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
				if(e.getSource()==b1) {
					i = Integer.parseInt(t1.getText());
					k = Integer.parseInt(t2.getText());
					/*i++;
					k++;
					a = "Ваше первое число теперь равно " + i;
					b = "Ваше второе число теперь равно " + k;*/
					
					s1 = i + k;
					s2 = i - k;
					s3 = i * k;
					s4 = i / k;
					
					a = "Сумма равна " + s1;
					b = "Разность равна " + s2;
					c = "Произведение равно " + s3;
					d = "Частное равно " + s4;
					
					l3.setText(a);
					l4.setText(b);
					l5.setText(c);
					l6.setText(d);
				}
				
				if(e.getSource()==b2) {
					t1.setText(null);
					t2.setText(null);
					l3.setText("");
					l4.setText("");
					l5.setText("");
					l6.setText("");
				}
			}catch (Exception ex) { JOptionPane.showMessageDialog(null, "Введите в поле в число"); }
		}
		
	}
}
