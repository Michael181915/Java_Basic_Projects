import javax.swing.JOptionPane;

public class Reader {
	float i, k;
	String n1, n2;
	
	public void Scan() {
		
		n1 = JOptionPane.showInputDialog("������� ���� ������ �����");
		n2 = JOptionPane.showInputDialog("������� ���� ������ �����");	
		i = (float) Float.parseFloat(n1);
		k = (float) Float.parseFloat(n2);	
	}
	
	public void Scan(float a, float b) {
		
		JOptionPane.showMessageDialog(null, "���������� �����: " + a + " � " + b);
	
	}
	
}
