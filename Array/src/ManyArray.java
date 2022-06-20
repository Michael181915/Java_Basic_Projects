import java.util.Scanner;
import java.util.Random;

public class ManyArray {
	public static void main(String args[]) {

				@SuppressWarnings("resource")
				Scanner sss = new Scanner(System.in);
				Random rand = new Random();
				System.out.println("\n"+"Введите количество строк: \n");
				int r = sss.nextInt();
				System.out.println("\n"+"Введите количество столбцев: \n");
				int p = sss.nextInt();
				int m[][] = new int[r][p];
				int sum = 0;
				
				for(int x=0;x<m.length;x++) {
					for(int y=0;y<m[x].length;y++) {
						m[x][y] = rand.nextInt(20);			
						System.out.print(m[x][y]+"    ");
						try {
							Thread.sleep(150);
						}catch(Exception e){}
					sum += m[x][y];
					}
					System.out.println(); 
				}
				System.out.print("\n"+"\n"+sum); 
	}
}
