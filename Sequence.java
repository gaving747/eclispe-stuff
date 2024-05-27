package edu.ilstu.it287.lab07.gegarc3;

public class Sequence {
	private int [] values;
	public Sequence(int size) { values = new int[size]; }
	public void set(int i, int n) { values [i] = n; }
	public int get(int i) { return values [i]; }
	public int size() { return values.length; }
	
	public boolean isSame(Sequence S2)
	{
		//first checks to see if the lengths are the same
		if(this.size() != S2.size())
		{
			return false;
		}
		//checks each number of both values and compared the numbers at the appropriate number places
		for(int i = 0; i < this.size(); i++)
		{
			if(this.get(i) != S2.get(i))
			{
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[]args)
	{
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10,11};
		int[] intArray2 = new int[]{ 1,2,3,4,5,6,7,8,9,10,11};
		Sequence S1 = new Sequence(intArray.length);
		Sequence S2 = new Sequence(intArray2.length);
		S1.values = intArray;
		S2.values = intArray2;
		System.out.println(S1.isSame(S2));
		
	}
}
