package edu.ilstu.it287.pgm06.gegarc3;

public class vonSavant {
	
	public static void main(String[] args)
	{
		//variables
		int numWinsPerson1 = 0;
		int numWinsPerson2 = 0;
		int min = 1;
		int max = 3;
		
		//iterates 1000 times
		for(int i = 0; i < 1000; i++)
		{
			int otherOption = 1;
			//car with door
			int doorWithCar = (int)Math.floor(Math.random() * (max - min + 1) + min);
			//guess of person1
			int randomGuessPerson1 = (int)Math.floor(Math.random() * (max - min + 1) + min);
			//guess of person2
			int randomGuessPerson2 = (int)Math.floor(Math.random() * (max - min + 1) + min);
			//making the other door option
			while(otherOption == doorWithCar || otherOption == randomGuessPerson1)
			{
				if(otherOption == 3)
				{
					otherOption = 1;
				}
				else
				{
					otherOption++;
				}
	
			}
			//switching the guess for person 1
			int originalOption = randomGuessPerson1;
			while(randomGuessPerson1 == originalOption || randomGuessPerson1 == otherOption)
			{
				if(randomGuessPerson1 == 3)
				{
					randomGuessPerson1 = 1;
				}
				else
				{
					randomGuessPerson1++;
				}
			}
			//if person 1 wins then increase win count
			if(randomGuessPerson1 == doorWithCar)
			{
				numWinsPerson1++;
			}
			//if person 2 wins then increase win count
			if(randomGuessPerson2 == doorWithCar)
			{
				numWinsPerson2++;
			}
			
		}
		
		System.out.println("Player 1 wins: " + numWinsPerson1);
		System.out.println("Player 2 wins: " + numWinsPerson2);
	}
}
