package edu.ilstu.it287.pgm04.gegarc3;
import java.util.Scanner;
import java.time.*;
import java.time.Month;
import java.time.temporal.ChronoField;
public class Easter {
	public static void main(String[]args)
	{
		//asks user for input
		Scanner input1 = new Scanner(System.in); 
		System.out.println("Enter the year: ");
		int y = input1.nextInt();
		//below are all of the operations
		int a = y - ((y / 19)* 19);
		int b = y / 100;
		int c = y - ((y / 100) * 100);
		int d = b / 4;
		int e = b - ((b / 4) * 4);
		int g = (8*b+13)/25;
		int part1h = ((19 * a + b - d - g + 15) / 30) * 30;
		int h = (19 * a + b - d - g + 15) - part1h;
		int j = c / 4;
		int k = c - ((c/4) * 4);
		int m = (a + 11 * h) / 319;
		int part1r = ((2 * e + 2 * j - k - h + m + 32) / 7) * 7;
		int r = (2 * e + 2 * j - k - h + m + 32) - part1r;
		int n = (h - m + r + 90) / 25;
		int part1p = ((h - m + r + n + 19) / 32) * 32;
		int p = (h - m + r + n + 19) - part1p;
		//this gets the month of the letter n
		Month month = Month.of(n);
		//prints out everything
		System.out.println("In " + y + ", Easter fell on " + month + " " + p + ".");
	}
}

