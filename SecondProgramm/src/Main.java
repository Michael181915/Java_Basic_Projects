import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		int[] drinkPrices = {80, 150, 20, 70, 20};
		System.out.println("BEFORE");
		
		try {
			System.out.println(drinkPrices[3]);			
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception :((");
		}

		System.out.println("AFTER");
	}

}
