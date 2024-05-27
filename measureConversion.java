package edu.ilstu.it287.lab04.gegarc3;
import java.util.Scanner; 
public class measureConversion {
	public static void main (String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		//asks user for input
		System.out.println("Print a distance in meters:");
		final float length = myObj.nextFloat();
		//the lines below print out the converted numbers
		System.out.println("Meters to miles:");
		System.out.println(length * 0.000621371);
		System.out.println("Meters to feet:");
		System.out.println(length * 3.28084);
		System.out.println("Meters to inches:");
		System.out.println(length * 39.3701);
	}
}
