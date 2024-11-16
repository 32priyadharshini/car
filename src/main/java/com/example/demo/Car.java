package com.example.demo;

public class Car {
	private int amount;
	private String brand;
	public Car() {
		
	}
	public Car(int amount, String brand) {
		super();
		this.amount = amount;
		this.brand = brand;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Car [amount=" + amount + ", brand=" + brand + "]";
	}
	
	

}
