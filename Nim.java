package edu.ilstu.it287.pgm06.gegarc3;
import java.util.Scanner;
public class Nim {
	//decides how many marbles the smart bot will take each turn
	static int smartTake(int amount)
	{
		int i = 6;
		int desiredAmount = amount;
		while(desiredAmount >= amount)
		{
			desiredAmount = ((int) Math.pow(2, i)) - 1;
			i--;
		}
		int amountToRemove = amount - desiredAmount;
		return amountToRemove;
	}
	//decides how many marbles the smart bot will take each turn
	static int dumbTake(int amount)
	{
		int amount2 = (amount / 2);
		int returnInt = (int)Math.floor(Math.random() * (amount2 - 1 + 1) + 1);
		return returnInt;
	}
	
	public static void main(String[] args)
	{
		//variables
		int min1 = 0;
		int max1 = 1;
		int min2 = 10;
		int max2 = 100;
		Scanner myObj = new Scanner(System.in);
		
		//decides who will have the first turn
		int firstTurn = (int)Math.floor(Math.random() * (max1 - min1 + 1) + min1);
		//smart mode
		int smartMode = (int)Math.floor(Math.random() * (max1 - min1 + 1) + min1);
		
		//amount of marbles
		int amountOfMarbles = (int)Math.floor(Math.random() * (max2 - min2 + 1) + min2);
		
		
		System.out.println("The number of marbles is: " + amountOfMarbles);
		
		//code for when the robot plays dumb
		if(smartMode == 0)
		{
			System.out.println("The robot is playing on goofy mode");
			//if the robot is going first
			if(firstTurn == 1)
			{
				while(amountOfMarbles > 0)
				{
					//cycles between each turn, each time it checks if the amount of marbles left is 1, 
					//if it is 1, then the program ends and it tells who wins
					amountOfMarbles = amountOfMarbles - dumbTake(amountOfMarbles);
					if(amountOfMarbles == 1)
					{
						System.out.println("Bot has won");
						System.exit(0);
					}
					System.out.println("The robot has taken marbles, the total as of now is " + amountOfMarbles);
					System.out.println("print the amount of marbles to take away: ");
					int amountToTake = myObj.nextInt();
					amountOfMarbles = amountOfMarbles - amountToTake;
					if(amountOfMarbles == 1)
					{
						System.out.println("Human has won");
						System.exit(0);
					}
					System.out.println("The total amount of marbles after your pick is " + amountOfMarbles);
					
				}
			}
			//if you are going first 
			else
			{
				while(amountOfMarbles > 0)
				{
					//cycles between each turn, each time it checks if the amount of marbles left is 1, 
					//if it is 1, then the program ends and it tells who wins
					System.out.println("print the amount of marbles to take away: ");
					int amountToTake = myObj.nextInt();
					amountOfMarbles = amountOfMarbles - amountToTake;
					if(amountOfMarbles == 1)
					{
						System.out.println("Human has won");
						System.exit(0);
					}
					System.out.println("The total amount of marbles after your pick is " + amountOfMarbles);
					amountOfMarbles = amountOfMarbles - dumbTake(amountOfMarbles);
					if(amountOfMarbles == 1)
					{
						System.out.println("Bot has won");
						System.exit(0);
					}
					System.out.println("The robot has taken marbles, the total as of now is " + amountOfMarbles);
					
				}
			}
		}
		
		//////////////
		
		//the code down here does exactly what the code above does, except it uses the smart take for each time 
		//the bot makes a move(come to think of it I probably could have cut this code in half if I simply created a 
		//method that accepted the first turn, amount, and mode), there would be no need for this bottom half of code
		//unfortunately it is too late and I am extremely tired, sorry
		if(smartMode == 1)
		{
			System.out.println("The robot is playing on smart mode");
			if(firstTurn == 1)
			{
				while(amountOfMarbles > 0)
				{
					amountOfMarbles = amountOfMarbles - smartTake(amountOfMarbles);
					if(amountOfMarbles == 1)
					{
						System.out.println("Bot has won");
						System.exit(0);
					}
					System.out.println("The robot has taken marbles, the total as of now is " + amountOfMarbles);
					System.out.println("print the amount of marbles to take away: ");
					int amountToTake = myObj.nextInt();
					amountOfMarbles = amountOfMarbles - amountToTake;
					if(amountOfMarbles == 1)
					{
						System.out.println("Human has won");
						System.exit(0);
					}
					System.out.println("The total amount of marbles after your pick is " + amountOfMarbles);
					
				}
			}
			
			else
			{
				while(amountOfMarbles > 0)
				{
					System.out.println("print the amount of marbles to take away: ");
					int amountToTake = myObj.nextInt();
					amountOfMarbles = amountOfMarbles - amountToTake;
					if(amountOfMarbles == 1)
					{
						System.out.println("Human has won");
						System.exit(0);
					}
					System.out.println("The total amount of marbles after your pick is " + amountOfMarbles);
					amountOfMarbles = amountOfMarbles - smartTake(amountOfMarbles);
					if(amountOfMarbles == 1)
					{
						System.out.println("Bot has won");
						System.exit(0);
					}
					System.out.println("The robot has taken marbles, the total as of now is " + amountOfMarbles);
					
				}
			}
		}
		
		
		
	}
	
	
}
