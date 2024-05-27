package edu.ilstu.it287.pgm05.gegarc3;

public class romanNumeral {
	
	//this is almost like the functions below, except it only works for 1000 - 3,999
	public static void printFourDigits(int value)
	{
		String onethousand = "M";
		String stringVal = "";
		
		for(int i = 0; i < value; i+=1000)
		{
			stringVal += onethousand;
		}
		
		System.out.print(stringVal);
	}
	
	public static void printThreeDigits(int value)
	{
		String onehundred = "C";
		String fivehundred = "D";
		String onethousand = "M";
		String stringVal = "";
		
		if(value == 400)
		{
			stringVal = onehundred + fivehundred;
		}
		else if(value == 900)
		{
			stringVal = onehundred + onethousand;
		}
		else
		{
			if(value < 400)
			{
				for(int i = 0; i < value; i+=100)
				{
					stringVal += onehundred;
				}
			}
			
			if(value > 400)
			{
				stringVal += fivehundred;
				for(int i = 500; i < value; i+=100)
				{
					stringVal += onehundred;
				}
			}
		}
		System.out.print(stringVal);
	}
	
	public static void printTwoDigits(int value)
	{
		String ten = "X";
		String fifty = "L";
		String onehundred = "C";
		String stringVal = "";
		
		if(value == 40)
		{
			stringVal = ten + fifty;
		}
		else if(value == 90)
		{
			stringVal = ten + onehundred;
		}
		else
		{
			if(value < 40)
			{
				for(int i = 0; i < value; i+=10)
				{
					stringVal += ten;
				}
			}
			
			if(value > 40)
			{
				stringVal += fifty;
				for(int i = 50; i < value; i+=10)
				{
					stringVal += ten;
				}
			}
		}
		
		System.out.print(stringVal);
	}
	//checks if the number is a 4 or a 9, if it is it prints out the specific roman numeral
	//if not, then it sees if it is above 4 or below 4, if it is below 4 it will add the I symbol 
	//for the size of the number, if it is above four, it will do the exact same thing but with a V
	//in the beginning, the functions above(except for printFourDigits) actually do the exact same thing but
	//with bigger numbers
	public static void printDigit(int value)
	{
		String one = "I";
		String five = "V";
		String ten = "X";
		String stringVal = "";
		
		if(value == 4)
		{
			stringVal = one + five;
		}
		else if(value == 9)
		{
			stringVal = one + ten;
		}
		else
		{
			if(value < 4)
			{
				for(int i = 0; i < value; i++)
				{
					stringVal += one;
				}
			}
			
			if(value > 4)
			{
				stringVal += five;
				for(int i = 5; i < value; i++)
				{
					stringVal += one;
				}
			}
		}
		
		System.out.print(stringVal);
		
	}
	
	public static void main(String[] args)
	{
		//this is where you input your integer
		int num = 1978;
		//is here to determine the length of the number
		String length = Integer.toString(num);
		//holds the numbers outputted by the loop below
		int intArray[] = new int[length.length()];
		int placeHolder = 0;
		int currentNum = num;
		int adjustedNum;
		//separates each number in this way - 543 { 500, 40, 3}
		for(int i = length.length(); i > 0; i--)
		{
			int divisor = 1;
			for(int j = 0; j < i - 1; j++)
			{
				divisor = divisor * 10;
			}
			
			adjustedNum = (currentNum  / divisor) * divisor;
			intArray[placeHolder] = adjustedNum;
			placeHolder++;
			currentNum = currentNum - adjustedNum;
			
		}
		
		int secondPlaceHolder = 0;
		//chooses which function to perform based off of how many digits the current number from the array is 
		for(int k = intArray.length; k > 0; k--)
		{
			if(k == 1)
			{
				printDigit(intArray[secondPlaceHolder]);
			}
			
			else if(k == 2)
			{
				printTwoDigits(intArray[secondPlaceHolder]);
			}
			
			else if(k == 3)
			{
				printThreeDigits(intArray[secondPlaceHolder]);
			}
			
			else if( k == 4)
			{
				printFourDigits(intArray[secondPlaceHolder]);
			}
			secondPlaceHolder++;
		}
		
		
		
	}
}
