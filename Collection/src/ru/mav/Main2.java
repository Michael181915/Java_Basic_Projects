package ru.mav;

public class Main2 {
	private static Auto[] autos = new Auto[5];
	
	public static void main(String[] args) {
		autos[0] = new Auto(456777, "VW");
		autos[1] = new Auto(51097, "Toyota");
		autos[2] = new Auto(19777, "Audi");
		autos[3] = new Auto(930797, "Lada");
		autos[4] = new Auto(54999, "Nissan");
		
		for(Auto a: autos) {
			System.out.println(a.getNumber()+" "+a.getCar());
		}
	}
}
