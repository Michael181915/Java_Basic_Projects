package ru.mav;

public class Auto {
	private int number;
	private String car;
	
	public Auto(int number, String car) {
		this.number = number;
		this.car = car;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
}
