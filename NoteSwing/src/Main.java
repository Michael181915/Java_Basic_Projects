
public class Main {
	public static MainWindow window;

	public static void main(String[] args) {
		window = new MainWindow();		
		for(int i=0;i<20;i++) {
			window.addElement("Привет, мир! " + i +"-ый по счёту!");			
		}
	}
}
