package edu.ilstu.it287.pgm03.gegarc3;

public class RaceWalker {
	public int position;
	public Boolean right = true;
	public RaceWalker(int InitialPosition)
	{
		position = InitialPosition;
	}
	//change direction
	public void turn()
	{
		right = false;
	}
	//if the direction is right, then increase position, decrease it if otherwise
	public void move()
	{
		if(right == true)
		{
			position++;
		}
		else
		{
			position --;
		}
	}
	//prints position
	public int getPosition()
	{
		return position;
	}
	
	public static void main(String[]args)
	{
		RaceWalker rw = new RaceWalker(10);
		rw.move(); // now is at position 11
		rw.turn();
		rw.move(); // now is at position 10
		System.out.println(rw.getPosition());
		rw.turn();
		rw.move();
		rw.move();
		System.out.println("Should print 8");
		System.out.println(rw.getPosition());

	}
}
