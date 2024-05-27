package edu.ilstu.it287.lab03.gegarc3;

import java.text.NumberFormat;

public class Product {
	private String name;
	private double price;
	
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void reducePrice()
	{
		this.price = price - 5;
	}
	
	public static void main (String[] args) 
	{
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		Product toaster = new Product("Toaster", 29.59);
		Product lamp = new Product("Lamp", 15.15);
		System.out.println(toaster.getName());
		System.out.println(defaultFormat.format(toaster.getPrice()));
		System.out.println(lamp.getName());
		System.out.println(defaultFormat.format(lamp.getPrice()));
		toaster.reducePrice();
		lamp.reducePrice();
		System.out.println("Prices for items has been reduced");
		System.out.println(defaultFormat.format(toaster.getPrice()));
		System.out.println(defaultFormat.format(lamp.getPrice()));
		
		
	}
}
