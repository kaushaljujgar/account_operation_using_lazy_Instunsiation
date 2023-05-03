package com.jspiders.programmesa;

public class LaptopBuilder {
	private String brand;
	private int displaySize;
	private String ram;
	private String storageType;
	private String graphicCard;
	private int displayResolution;
	private double price;
	private String warranty;
	private String discount;
	
	public LaptopBuilder brand(String brand) {
		this.brand=brand;
		return this;
	}
	public LaptopBuilder displaySize(int displaySize) {
		this.displaySize=displaySize;
		return this;
	}
	public LaptopBuilder ram(String ram) {
		this.ram=ram;
		return this;
	}
	public LaptopBuilder storageType(String storageType) {
		this.storageType=storageType;
		return this;
	}
	public LaptopBuilder graphicCard(String graphicCard) {
		this.graphicCard=graphicCard;
		return this;
	}
	public LaptopBuilder displayResolution(int displayResolution) {
		
		this.displayResolution=displayResolution;
		return this;
	}
	public LaptopBuilder price(int price) {
		this.price=price;
		return this;
	}
	public LaptopBuilder warranty(String warranty) {
		this.warranty=warranty;
		return this;
	}
	public LaptopBuilder discount(String discount) {
		this.discount=discount;
		return this;
	}
	
	public Laptop getlaptop() {
		Laptop laptop=new Laptop(this.brand,this.displaySize,this.ram,this.storageType,this.graphicCard,
				this.displayResolution,this.price,this.warranty,this.discount);
		return laptop;
	
	}
	
	
	
	

}
