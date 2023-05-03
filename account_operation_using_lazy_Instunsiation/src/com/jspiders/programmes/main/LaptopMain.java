package com.jspiders.programmes.main;

import com.jspiders.programmesa.Laptop;
import com.jspiders.programmesa.LaptopBuilder;

public class LaptopMain {
	public static void main(String[] args) {
		Laptop laptop=new LaptopBuilder().brand("Dell:E7470").displaySize(14).ram("8GB").storageType("SSD").graphicCard("Intel Core I5").price(55000).warranty("1-Year").discount("10%").getlaptop();
		System.out.println(laptop);
	}

}
