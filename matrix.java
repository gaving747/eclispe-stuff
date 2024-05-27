package edu.ilstu.it287.pgm07.gegarc3;
import java.util.Scanner;  // Import the Scanner class
public class matrix {
	//each individual sum 
	 int sumRow1 = 0;
	 int sumRow2 = 0;
	 int sumRow3 = 0;
	 int sumRow4 = 0;
	 int sumDiagonal1 = 0;
	 int sumDiagonal2 = 0;
	 
	public matrix(int a, int b, int c, int d, int e, int f)
	{
		this.sumRow1 = a;
		this.sumRow2 = b;
		this.sumRow3 = c;
		this.sumRow4 = d;
		this.sumDiagonal1 = e;
		this.sumDiagonal2 = f;
	}

	//
	public void rowSum(int[][] arr, int rowNumber)
	{
		//adds the total sum of the row specified
		int sumRow = 0;
		for(int i = 0; i < 4; i++)
		{
			sumRow += arr[rowNumber - 1][i];
		}
		//checks to see which row is being chosen
		if(rowNumber == 1)
		{
			this.sumRow1 = sumRow;
		}
		
		else if(rowNumber == 2)
		{
			this.sumRow2 = sumRow;
		}
		
		else if(rowNumber == 3)
		{
			this.sumRow3 = sumRow;
		}
		
		else if(rowNumber == 4)
		{
			this.sumRow4 = sumRow;
		}
	}
	//adds the diagonal sum
	public void diagonalSum1(int[][] arr)
	{
		int sumRow = 0;
		for(int i = 0; i < 4; i++)
		{
			sumRow += arr[i][i];
		}
		this.sumDiagonal1 = sumRow;
	}
	//adds the other diagonal sum
	public void diagonalSum2(int[][] arr)
	{
		int sumRow = 0;
		int j = 0;
		for(int i = 3; i >= 0; i--)
		{
			sumRow += arr[i][j];
			j++;
		}
		this.sumDiagonal2 = sumRow;
	}
	public static void main(String[] args)
	{
		//asks user for input, and allows the user to add in a number one at a time until they have reached 16 numbers
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		int[] intArray = new int[16];
		int total = 0;
		for(int i = 0; i < 16; i++)
		{
			System.out.println("print number: ");
			int input = myObj.nextInt();  // Read user input
			intArray[i] = input;
			//checks if the number entered is the same as the place value +1, this is how I check to see if 
			//every number added is a perfect count from 1-16
			if(input == i + 1)
			{
				total++;
			}
		}

		//this adds each number to the square in the order it was inputed 
		 int h = 0;
		 int[][] arr = new int[4][4];
		 for(int i = 0; i < 4; i++)
		 {
			 for(int j = 0; j < 4; j++)
			 {
				 arr[i][j] = intArray[h];
				 h++;
			 }
		 }
		 
		 //this prints out the square
		 for(int i = 0; i < 4; i++)
		 {
			 for(int j = 0; j < 4; j++)
			 {
				 System.out.print(arr[i][j] + ", ");
			 }
			 System.out.println();
		 }
		 
		 
		 matrix M1 = new matrix(0,0,0,0,0,0);
		 
		 M1.rowSum(arr, 1);
		 M1.rowSum(arr, 2);
		 M1.rowSum(arr, 3);
		 M1.rowSum(arr, 4);
		 M1.diagonalSum1(arr);
		 M1.diagonalSum2(arr);
		 
		 /*
		 System.out.println(M1.sumRow1);
		 System.out.println(M1.sumRow2);
		 System.out.println(M1.sumRow3);
		 System.out.println(M1.sumRow4);
		 System.out.println(M1.sumDiagonal1);
		 System.out.println(M1.sumDiagonal2);
		 */
		 //this checks to see if numbers 1- 16 were perfecty added into the matrix at the beginning
		 if(total == 16)
		 {
			 System.out.println("values are all 1 - 16");
		 }
		 //this checks to see if all of the sums are equal to one another
		 if(M1.sumRow1 == M1.sumRow2 && M1.sumRow2 == M1.sumRow3 && M1.sumRow3 == M1.sumRow4 && M1.sumRow4 == M1.sumDiagonal1 && M1.sumDiagonal1 == M1.sumDiagonal2)
		 {
			 System.out.println("magic square");
		 }
		 
		 else
		 {
			 System.out.println("not a magic square");
		 }
		 
		
	}
}
