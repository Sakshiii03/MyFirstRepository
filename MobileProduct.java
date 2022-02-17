package com.javatpoint;

public class MobileProduct {
	private int id;
	private String brand;
	private double price;


	//default constructor
	public MobileProduct() {

	}

		//constructor using fields
	public MobileProduct(int id, String brand,  double price) {
		super();
		this.id = id;
		this.brand = brand;
		
		this.price = price;
		
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
}