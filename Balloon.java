package edu.ilstu.it287.pgm02.gegarc3;

class Battery
{
	public double capacity;
	public double currentAmount;
	public Battery(double capacity)
	{
		this.capacity = capacity;
		this.currentAmount = capacity;
	}
	
	public void drain(double amount)
	{
		if(amount <= currentAmount)
		{
			currentAmount = currentAmount - amount;
		}
	}
	
	public void charge()
	{
		currentAmount = capacity;
	}
	
	public double getRemainingCapacity()
	{
		return currentAmount;
	}
	
}

public class Balloon {
	private double radius = 0;
	
	public void inflate(int amount)
	{
		radius += amount;
	}
	
	public double getVolume() 
	{
		return Math.pow(radius, 3);
	}
	
	public static void main(String[]args)
	{
		Balloon B1 = new Balloon();
		B1.inflate(5);
		System.out.println(B1.getVolume());
		System.out.println("//////");
		Battery battery1 = new Battery(3000);
		battery1.drain(1000);
		System.out.println(battery1.getRemainingCapacity());
		battery1.charge();
		System.out.println(battery1.getRemainingCapacity());
		
	}
	
}
