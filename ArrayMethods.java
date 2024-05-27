package edu.ilstu.it287.lab07.gegarc3;

public class ArrayMethods {
	//I understand that I should have created the array as a class attribute so I wouldn't have to 
	//create a new array each time, I just wish I understood that earlier
	public static void swapFirstAndLast(int[] values1)
	{	
		//done so I can freely edit the array 
		int values[] = new int[values1.length];
		for(int i = 0; i < values.length; i++)
		{
			values[i] = values1[i];
		}
		//switches the first and last values
		int temp = values[0];
		values[0] = values[values.length - 1];
		values[values.length - 1] = temp;
		//prints out the array 
		for(int i = 0; i < values.length; i++)
		{
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}
	
	public static void shiftAllAndMoveLastBack(int[] values1)
	{
		
		int values[] = new int[values1.length];
		for(int i = 0; i < values.length; i++)
		{
			values[i] = values1[i];
		}
		int[] newArray = new int[values.length];
		//shifts each value except for the last values
		for(int i = 1; i < newArray.length; i++)
		{
			newArray[i] = values[i - 1]; 
		}
		//adds in the last value into the first place
		newArray[0] = values[values.length -1];
		for(int i = 0; i < newArray.length; i++)
		{
			System.out.print(newArray[i] + " ");
		}
		System.out.println();
	}
	
	public static void evenToZero(int[] values1)
	{
		int values[] = new int[values1.length];
		for(int i = 0; i < values.length; i++)
		{
			values[i] = values1[i];
		}
		//if the value is even then it will turn it to 0
		for(int i = 0; i < values.length; i++)
		{
			if(values[i] % 2 == 0)
			{
				values[i] = 0;
			}
		}
		
		for(int i = 0; i < values.length; i++)
		{
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}
	
	public static void removeMiddle(int[] values1)
	{
		int values[];
		//if it is odd, then it only removes the middle value
		if(values1.length % 2 != 0)
		{
			values = new int[values1.length - 1];
			int j = 0;
			for(int i = 0; i < values1.length; i++)
			{
				if(i != values1.length / 2)
				{
					values[j] = values1[i];
					j++;
				}
			}
		}
		//if it is even then it will remove both middle values
		else
		{
			values = new int[values1.length - 2];
			int j = 0;
			for(int i = 0; i < values1.length; i++)
			{
				if(i != (values1.length / 2 - 1) && i != (values1.length / 2))
				{
					values[j] = values1[i];
					j++;
				}
			}
		}
		
		for(int i = 0; i < values.length; i++)
		{
			System.out.print(values[i] + " ");
		}
		System.out.println();
		
	}
	
	public static void evensToFront(int[] values1)
	{
		int values[] = new int[values1.length];
		int j = 0;
		int currentLength = 0;
		//goes through the array and finds all the even numbers and adds those even numbers to the new array fist
		for(int i = 0; i < values1.length;i++)
		{
			if(values1[i] % 2 == 0)
			{
				values[j] = values1[i];
				j++;
				currentLength++;
			}
		}
		
		
		int h= currentLength;
		//adds the rest of the odd numbers
		for(int l = 0; l < values1.length; l++)
		{
			if(values1[l] % 2 != 0)
			{
				values[h] = values1[l];
				h++;
			}
		}
		
		for(int i = 0; i < values.length; i++)
		{
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}
	
	public static int secondHighest(int[] values1)
	{
		int highestNumber = 0;
		int secondHighest = 0;
		//goes through the array, and check if a number is higher than the highest number or between the highest number and second highest number
		//if its the highest then the prev highest number is moved to the second place
		//if middle number is found, then that is the new second values then 
		for(int i = 0; i < values1.length; i++)
		{
			if(values1[i] > highestNumber)
			{
				secondHighest = highestNumber;
				highestNumber = values1[i];
				
			}
			else if(values1[i] < highestNumber && values1[i] > secondHighest)
			{
				secondHighest = values1[i];
			}
		}
		return secondHighest;

	}
	
	public static boolean inAscending(int[] values1)
	{
		//goes through the array and checks if every number is smaller than the number after it 
		for(int i = 0; i < values1.length - 1; i++)
		{
			if(values1[i] > values1[i+1])
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean adjacent(int[] values1)
	{
		//checks if each number next to each number is equal to it
		for(int i = 0; i < values1.length-1; i++)
		{
			if(values1[i] == values1[i+1])
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean duplicates(int[] values1)
	{
		//for each number, it shifts through the array and checks if that number is repeated or not
		//come to think of it, this would probably be a lot more efficient if I were to sort the numbers first
		//too bad I didn't think of that until later
		for(int i = 0; i < values1.length; i++)
		{
			for(int j = 0; j < values1.length; j++)
			{
				if(values1[i] == values1[j] && i != j)
				{
					return true;
				}
					
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10,11}; 
		swapFirstAndLast(intArray);
		shiftAllAndMoveLastBack(intArray);
		evenToZero(intArray);
		removeMiddle(intArray);
		evensToFront(intArray);
		System.out.println(secondHighest(intArray));
		System.out.println(inAscending(intArray));
		System.out.println(adjacent(intArray));
		System.out.println(duplicates(intArray));
		
	}
}
