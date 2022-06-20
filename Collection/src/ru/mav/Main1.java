package ru.mav;

public class Main1 {
	private static String[][] autos = { 
			{"456777", "VW"},
			{"51097", "Toyota"},
			{"19777", "Audi"},
			{"930797", "Lada"},
			{"54999", "Nissan"}
		};

	public static void main(String[] args) {
		for(int i=0;i<autos.length;i++){
			for(int k=0;k<autos[i].length;k++){
				System.out.println(autos[i][k]+ " ");
			}System.out.println();
		}
	}
}
