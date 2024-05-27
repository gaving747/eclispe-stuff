package edu.ilstu.it287.pgm09.gegarc3;
import java.util.*;

class clock {
	//returns the hours
	public static int getHours(Calendar h)
	{
		return h.get(Calendar.HOUR);
	}
	//returns the minute
	public static int getMinutes(Calendar m)
	{
		return m.get(Calendar.MINUTE);
	}
	//returns both 
	public static String toString(Calendar s)
	{
		return getHours(s) + ":" + getMinutes(s);
	}
	
}

class alarm extends clock
{
	//checks if the times are the same, if they are then the alarm rings
	public static void setTime(int hours, int minutes, Calendar c)
	{
		if(getHours(c) == hours && getMinutes(c) == minutes)
		{
			System.out.println("Ring Ring Ring!");
		}
	}
}


public class test extends alarm{
	public static void main(String args[])
	{
		 Calendar c = Calendar.getInstance();
		 System.out.println(toString(c));
		 setTime(9, 14, c);

	}
}
