package edu.ilstu.it287.lab06.gegarc3;

public class numberLoop {
	//prints the sum of every even number
	public static void sumOfEvens()
	{
		int sum = 0;
		//starts at 2 and prints every other number
		for(int i = 2; i <= 10; i+=2)
		{
			sum += i;
		}
		System.out.println(sum);
	}
	//prints the sum of all of the squares of number between 1 and 100
	public static void sumOfSquares()
	{
		int sum = 0;
		//adds to sum of each number squared
		for(int i = 1; i <= 100; i++)
		{
			sum += i*i;
		}
		System.out.println(sum);
	}
	//prints each 2^i value
	public static void allPowers()
	{
		//prints each 2^n value between 0 and 20
		for(int i = 0; i <= 20; i++)
		{
			System.out.print(Math.pow(2, i) + ", ");
		}
		System.out.println();
	}
	//prints the sum of odd numbers between 2 inputed numbers
	public static void oddsBetween(int a, int b)
	{
		int sum = 0;
		//from a to b, checks if each number in between is odd or even with modulo
		for(int i = a; i <= b; i++)
		{
			if(i % 2 != 0)
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}
	//prints the sum of odd digits in a number
	public static void oddsOfNumber(int a)
	{
		int newInt = a;
		//done to get the integer length 
		String input = Integer.toString(a);
		int sum = 0;
		for(int i = 0; i < input.length(); i++)
		{
			//gets the back digit of each number, and checks if it is even or not
			if((newInt % 10) % 2 != 0)
			{
				sum += (newInt % 10);
			}
			newInt = newInt / 10;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		sumOfEvens();
		sumOfSquares();
		allPowers();
		oddsBetween(1,7);
		oddsOfNumber(712345);
		
	}
}
