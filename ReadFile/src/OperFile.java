import java.util.Scanner;
//import java.io.FileNotFoundException;
import java.io.File;

import javax.swing.JOptionPane;

public class OperFile {
	static String [][] h = new String [5][3];
	static Scanner scc;
	
	public static void main(String args[]) { 
	//public static void main (String args[]) throws FileNotFoundException {
		/*couunt();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int words = 0;
        int lines = 0;
		//static String [][] h = new String [10][10];
		//static Scanner scc;*/		
		openFile();
		readFile();	
		out();
		
	}

	private static void out() {
		for(int r=0;r<h.length;r++) {
			for(int c=0;c<h[r].length;c++) {
				System.out.println(h[r][c]+"  ");
			}
			System.out.println();
		}		
	}

	private static void readFile() {
		while(scc.hasNext()){
			for(int r=0;r<h.length;r++) {
				for(int c=0;c<h[r].length;c++) {
					h[r][c] = scc.next();
				}
			}
		}
	}

	private static void openFile() {
		try{
			scc = new Scanner(new File("res//1.txt"));
		}catch(Exception e) {JOptionPane.showMessageDialog(null,"���� �� ������");}
	}
	
	/*private static void couunt(String filename) throws FileNotFoundException {
        while (scanner.hasNextLine()) {
            lines++;
            String[] array = scanner.nextLine().split(" ");
            //words = words + array.length;
            words = array.length;
        }
	}*/	
}
