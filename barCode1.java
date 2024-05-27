package edu.ilstu.it287.pgm08.gegarc3;
import java.util.Scanner; 
public class barCode1 {
	public static void main(String[]args)
	{
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter number that is 5 digits");

	    int input = myObj.nextInt();  // Read user input
	 
		int num = input;
		int num3 = num;
		int sum1 = 0;
		int sum2 = 0;
		//calculates 6th digit
		for(int i = 0; i < 5; i++)
		{
			sum1 += num3 % 10;
			num3 = num3 / 10;
		}
		while(sum1 % 10 != 0)
		{
			sum1++;
			sum2++;
		}
		//converts int to string 
		String s1 = Integer.toString(num);
		String s2 = Integer.toString(sum2);
		s1 = s1 + s2;
		num = Integer.parseInt(s1); 
		int num2 = num;
		String[] digits = new String[6];
		int p = 5;
		//assigns each number a specific bar code
		for(int i = 0; i < 6; i++)
		{
			
			if(num2 % 10 == 0)
			{
				digits[p] = "||:::";
			}
			else if(num2 % 10 == 9)
			{
				digits[p] = "|:|::";
			}
			else if(num2 % 10 == 8)
			{
				digits[p] = "|::|:";
			}
			else if(num2 % 10 == 7)
			{
				digits[p] = "|:::|";
			}
			else if(num2 %  10 == 6)
			{
				digits[p] = ":||::";
			}
			else if(num2 % 10 == 5)
			{
				digits[p] = ":|:|:";
			}
			else if(num2 % 10 == 4)
			{
				digits[p] = ":|::|";
			}
			else if(num2 % 10 == 3)
			{
				digits[p] = "::||:";
			}
			else if(num2 % 10 == 2)
			{
				digits[p] = "::|:|";
			}
			else if(num2 % 10 == 1)
			{
				digits[p] = ":::||";
			}
			
			num2 = num2 / 10;	
			p--;
		}
		//prints out barcode
		System.out.print("|");
		for(int i = 0; i < 6; i++)
		{
			System.out.print(digits[i]);
		}
		System.out.print("|");
		System.out.println();
		
		/////
		int[] intArray = new int[]{7,4,2,1,0};
		int sum3 = 0;
		//goes through each symbol in each bar code segment, and decides the value of each bar code value
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(digits[i].charAt(j) == '|')
				{
					sum3 += intArray[j] * 1;
				}
			}
			System.out.print(sum3 + ",");
			sum3 = 0;
		}
		
	}

}
