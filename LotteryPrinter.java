package edu.ilstu.it287.lab02.gegarc3;
import java.util.Random;
public class LotteryPrinter {
	
	public static void main(String args[])
	{
		System.out.println("Play this combination, it will make you rich!");
		Random random = new Random();
		for(int i = 0; i < 6; i++)
		{
			System.out.print(random.nextInt(50 - 1) + 1 + ", ");
		}
	}
}
