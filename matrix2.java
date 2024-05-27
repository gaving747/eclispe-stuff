package edu.ilstu.it287.pgm07.gegarc3;
import java.util.Scanner;  // Import the Scanner class
public class matrix2 {
	
	public static void main(String[] args)
	{
		//asks the user for input
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("print out an odd number");
		int input = myObj.nextInt();  // Read user input
		//inputs number
		if(input % 2 == 0)
		{
			System.out.println("This ain't gonna work pal, I quit");
			System.exit(0);
		}
			
		int num = input;
		int row = num - 1;
		int column = num / 2;
		int rowPrev;
		int columnPrev;
		//for each number added
		int[][] arr = new int[num][num];
		for(int i = 1; i <= num * num; i++)
		{
			//places the number
			arr[row][column] = i;
			rowPrev = row;
			columnPrev = column;
			//adds one to each value
			row++;
			column++;
			//if either value is equal to the num value, then make it 0
			if(row == num)
			{
				row = 0;
			}
			if(column == num)
			{
				column = 0;
			}
			if(arr[row][column] != 0)
			{
				//makes the prev and colum values their previous values and then decrements row by 1
				row = rowPrev;
				column = columnPrev;
				row--;
				
			}
		}
		//prints out everything
		for(int i = 0; i < num; i++)
		 {
			 for(int j = 0; j < num; j++)
			 {
				 System.out.print(arr[i][j] + ", ");
			 }
			 System.out.println();
		 }
	}
} 
