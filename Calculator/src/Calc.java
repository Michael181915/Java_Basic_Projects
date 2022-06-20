import javax.swing.JFrame;

public class Calc {
	public static void main(String args[]) {
		RRR r = new RRR("Сложение двух чисел");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(300, 200);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
		
	}
}
