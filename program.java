package edu.ilstu.it287.lab10.gegarc3;
import java.util.Arrays;
interface Sequence {
	int next();
	//sets each value in the array equal to each production of the next method
	default int[] values(int n)
	{
		int[] numbers=new int[n];
		for(int i=0;i<n;i++)
		{
			numbers[i]=next();
		}
		return numbers;
	}
	//multiples a value on repeat by a specific amount
	static Sequence multiplesOf(int n)
	{
	
		Sequence s = new Sequence() {
			private int k; 
			private int multiplier=n;
			//next method
			public int next() {
			
				int number= k*multiplier;
				k++;
				return number;
			}
		};
		return s;
	}
	//repeatedly does a power operation, and stacks the number
	static Sequence powersOf(int n)
	{
	
		Sequence s = new Sequence() {
			private int k;
			private int power=n;
			//next method
			public int next() {
			
			int Number=(int)Math.pow(k, power);
			k++; 
			return Number;
			}
		};
		return s; 
	}
}

public class program {
	public static void main(String args[])
	{
		Sequence s1=Sequence.multiplesOf(6);
		Sequence s2=Sequence.powersOf(6);
		int[] multiples=s1.values(6);
		int[] powers=s2.values(6);
		System.out.println(Arrays.toString(multiples));
		System.out.println(Arrays.toString(powers));
	}
}
