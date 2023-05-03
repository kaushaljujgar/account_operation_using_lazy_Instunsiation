package com.jspiders.programmesa;

public class Laptop {
	private String brand;
	private int displaySize;
	private String ram;
	private String storageType;
	private String graphicCard;
	private int displayResolution;
	private double price;
	private String warranty;
	private String discount;
	public Laptop(String brand, int displaySize, String ram, String storageType, String graphicCard,
			int displayResolution, double price, String warranty, String discount) {
		super();
		this.brand = brand;
		this.displaySize = displaySize;
		this.ram = ram;
		this.storageType = storageType;
		this.graphicCard = graphicCard;
		this.displayResolution = displayResolution;
		this.price = price;
		this.warranty = warranty;
		this.discount = discount;
	}
	public String toString() {
		return "=====Laptop====\n"+"brand:"+this.brand+"\n"+"displaySize:"+this.displaySize+"\n"+
				"ram:"+this.ram+"\n"+"storageType:"+this.storageType+"\n"+"graphicCard:"+this.graphicCard+"\n"+
				"displayResolution:"+this.displayResolution+"\n"+"price:"+this.price+"\n"+
				"warranty:"+this.warranty+"\n"+"discount:"+this.discount;
				
		
	}
	

}
