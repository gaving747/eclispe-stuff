package edu.ilstu.it287.lab05.gegarc3;
import java.util.Scanner; 
public class compass {
	public static void main (String[]args)
	{
		 Scanner angle = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter angle between 0 and 360 degrees");
		 int direction = angle.nextInt();  // Read user input
		 //if the input is not between 0 and 360 then it's not valid
		 if(direction > 360 || direction < 0)
		 {
			System.out.println("Entry not valid");
			System.exit(0);
		 }
		 //if between 337 and 23 then print north
		 else if((direction >= 337 && direction <= 360) || (direction <= 23 && direction >= 0))
		 {
			 System.out.println("North");
		 }
		 //if between 24 and 66 print north east
		 else if(direction >= 24 && direction <= 66)
		 {
			 System.out.println("North East");
		 }
		 //if between 67 and 113 print east
		 else if(direction >= 67 && direction <= 113)
		 {
			 System.out.println("East");
		 }
		 //if between 114 and 156 print south east
		 else if(direction >= 114 && direction <= 156)
		 {
			 System.out.println("South East");
		 }
		 //if between 157 and 203 print south
		 else if(direction >= 157 && direction <= 203)
		 {
			 System.out.println("South");
		 }
		 //if between 204 and 246 print south west
		 else if(direction >= 204 && direction <= 246)
		 {
			 System.out.println("South West");
		 }
		 //if between 247 and 293 print west
		 else if(direction >= 247 && direction <= 293)
		 {
			 System.out.println("West");
		 }
		 //if between 294 and 336 print north west
		 else if(direction >= 294 && direction <= 336)
		 {
			 System.out.println("North West");
		 }
	}
}
