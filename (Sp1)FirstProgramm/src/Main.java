import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws java.lang.Exception {
		System.out.println("Кофе-машина");
		
		int moneyAmount = 100;
		
		int espressoPrice = 80;
		int cappucinoPrice = 150;
		int milkPrice = 55;
		int waterPrice = 20;
		
		boolean canBuyAnything = false;
		
		if(moneyAmount >= espressoPrice) {
			System.out.println("Вы можете купить эспрессо");
			canBuyAnything = true;
		}
		
		if(moneyAmount >= cappucinoPrice) {
			System.out.println("Вы можете купить капучино");
			canBuyAnything = true;
		}
		
		if(moneyAmount >= waterPrice) {
			System.out.println("Вы можете купить бутылку воды");	
			canBuyAnything = true;
		}
		
		if(moneyAmount >= milkPrice) {
			System.out.println("Вы можете купить стакан молока");	
			canBuyAnything = true;
		}

		if(!canBuyAnything) {
			System.out.println("Недостаточно средств");	
			canBuyAnything = true;
		}
		
	}

}
