import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws java.lang.Exception {
		System.out.println("����-������");
		
		int moneyAmount = 100;
		
		int espressoPrice = 80;
		int cappucinoPrice = 150;
		int milkPrice = 55;
		int waterPrice = 20;
		
		boolean canBuyAnything = false;
		
		if(moneyAmount >= espressoPrice) {
			System.out.println("�� ������ ������ ��������");
			canBuyAnything = true;
		}
		
		if(moneyAmount >= cappucinoPrice) {
			System.out.println("�� ������ ������ ��������");
			canBuyAnything = true;
		}
		
		if(moneyAmount >= waterPrice) {
			System.out.println("�� ������ ������ ������� ����");	
			canBuyAnything = true;
		}
		
		if(moneyAmount >= milkPrice) {
			System.out.println("�� ������ ������ ������ ������");	
			canBuyAnything = true;
		}

		if(!canBuyAnything) {
			System.out.println("������������ �������");	
			canBuyAnything = true;
		}
		
	}

}
