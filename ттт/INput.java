import javax.swing.JFrame;

public class INput {
	public static void main(String args[]) {
		Reader r = new Reader("�������� ���� �����");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(300, 200);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
		
	}
}
