import java.util.Scanner;
import java.util.Random; 

public class Number {
	public static void main(String args[]) {

	@SuppressWarnings("resource")
	Scanner scn = new Scanner(System.in);		
	System.out.println("\n"+"¬ведите число от 0 до 2: \n");
	int t = scn.nextInt();	
	//do {
		    if(t==1) { 
				@SuppressWarnings("resource")
				Scanner sss = new Scanner(System.in);
				Random rand = new Random();
				System.out.println("\n"+"¬ведите размерность одномерного массива: \n");
				//int r = 0;
				int r = sss.nextInt();	
				int m[] = new int[r];
				int sum = 0;
				
				for(int x=0;x<m.length;x++) {
					m[x] = rand.nextInt(20);
					System.out.println(m[x]);
					sum += m[x];
				}
				System.out.println("\n"+sum); 
			}
			
		    else if(t==2) { 
		    	int[] n = new int[20];
		    	for(int y=0;y<n.length;y++) {
		    		n[y] = y*2;		    		
		    		System.out.println(n[y]);} 
		    }
		    
		    else { 
		    	System.out.println("\n"+"¬ведите другое число \n");
		    	}	
		    //} while(t!=0);      
	}
}
