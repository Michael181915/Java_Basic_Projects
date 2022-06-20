package ru.mav;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static ArrayList<Auto> autos = new ArrayList<Auto>();
	private static Random r = new Random();
	//private static Random p = new Random();
	
	public static void main(String[] args) {
		for(int i=0;i<200000;i++) {
			//char c = (char)(p.nextInt(9999) + 'h');
			autos.add(new Auto(r.nextInt(199999), "abcdefghijklmnostprqxyz"));
		}
		for(Auto a: autos) {
			System.out.println(a.getNumber()+" "+a.getCar());
		}

	}
}


