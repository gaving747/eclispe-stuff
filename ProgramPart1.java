package edu.ilstu.it287.pgm10.gegarc3;

public class ProgramPart1 {
	//prints the numbers that are not negative 1 
	public static void print(int[] r)
	{
		for(int i= 0; i < r.length; i++)
		{
			if(r[i] != -1)
			{
				System.out.println(r[i]);
			}
		}
	}
	//checks to see if a number is prime or not
	public static boolean isPrime(int x)
	{
		if(x == 0 || x == 1 || x == 2)
		{
			return false;
		}
		for(int i = x - 1; i >= 2; i--)
		{
			if(x % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public interface Sequence {
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
		
		
		static Sequence prime(int n)
		{
			//checks if each value is prime, if it is then it adds it, if not then it will add -1
			Sequence s = new Sequence() {
				private int k = 0;
				//next method
				int number;
				public int next() {
					k++;
					number = -1;
					if(isPrime(k) == true)
					{
						number= k;
					}
					return number;
				}
			};
			return s;
		}
		
	}
	
	public static void main(String[]args)
	{
		Sequence s1=Sequence.prime(23);
		int[] primes=s1.values(23);
		print(primes);
	}
}
