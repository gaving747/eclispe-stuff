package edu.ilstu.it287.lab02.gegarc3;
public class TravelDecider {
	
	public static double Computation(double distance, double MPG, double costPerGallon, double maintenance)
	{
		double totalCost = 0;
		double totalGallonsUsed = 0;
		totalGallonsUsed = distance / MPG;
		totalCost += costPerGallon * totalGallonsUsed;
		totalCost += maintenance * distance;
		return totalCost;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(Computation(73,18,4,0.05));
		if(Computation(73, 18, 4, 0.05) > 20)
		{
			System.out.println("Take the train");
		}
		
		else if(Computation(73, 18, 4, 0.05) < 20)
		{
			System.out.println("Take your car");
		}
		
		else
		{
			System.out.println("They are the same cost");
		}
	}

}
