import javax.swing.JOptionPane;

public class Reader {
	float i, k;
	String n1, n2;
	
	public void Scan() {
		
		n1 = JOptionPane.showInputDialog("Введите ваше первое число");
		n2 = JOptionPane.showInputDialog("Введите ваше второе число");	
		i = (float) Float.parseFloat(n1);
		k = (float) Float.parseFloat(n2);	
	}
	
	public void Scan(float a, float b) {
		
		JOptionPane.showMessageDialog(null, "Полученные числа: " + a + " и " + b);
	
	}
	
}
