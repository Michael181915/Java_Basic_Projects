import javax.swing.JFrame;

public class INput {
	public static void main(String args[]) {
		Reader r = new Reader("Сложение двух чисел");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(200, 300);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
		
	}
}
