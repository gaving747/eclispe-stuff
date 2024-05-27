package edu.ilstu.it287.pgm09.gegarc3;
import java.util.*;

class appointment
{
	String event;
	Calendar C;
	//constructor, accepts event label and time, it is used for the three classes below
	public appointment(String event, Calendar C)
	{
		this.event = event;
		this.C = C;
	}
	//returns hours
	public static int getHours(Calendar h)
	{
		return h.get(Calendar.HOUR);
	}
	//returns minutes
	public static int getMinutes(Calendar h)
	{
		return h.get(Calendar.MINUTE);
	}
	//returns day
	public static int getDay(Calendar h)
	{
		return h.get(Calendar.DAY_OF_MONTH);
	}
	//returns month
	public static int getMonth(Calendar h)
	{
		return h.get(Calendar.MONTH);
	}
	
	
}

class oneTime extends appointment
{
	public oneTime(String event, Calendar C)
	{
		super(event, C);
	}
	//checks of all attributes are equal to each other, if so then the appointments match 
	public boolean checkAppointment(Calendar c)
	{
		if(getHours(c) == getHours(C) && getMinutes(c) == getMinutes(C) && getDay(c) == getDay(C) && getMonth(c) == getMonth(C))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class daily extends appointment
{
	public daily(String event, Calendar C)
	{
		super(event, C);
	}
	//checks if hours and minutes match, if so then the appointments match 
	public boolean checkAppointment(Calendar c)
	{
		if(getHours(c) == getHours(C) && getMinutes(c) == getMinutes(C))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class monthly extends appointment
{
	public monthly(String event, Calendar C)
	{
		super(event, C);
	}
	//checks if the days match, if so then the appointments match
	public boolean checkAppointment(Calendar c)
	{
		if(getDay(c) == getDay(C))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class test2 
{
	public static void main(String[] args)
	{
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR,8);
		cal.set(Calendar.MINUTE,30);
		cal.set(Calendar.MONTH, 4);
		cal.set(Calendar.DAY_OF_MONTH, 21);
		oneTime O1 = new oneTime("Tennis", cal);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.HOUR,9);
		cal2.set(Calendar.MINUTE,25);
		cal2.set(Calendar.MONTH, 5);
		cal2.set(Calendar.DAY_OF_MONTH, 31);
		daily O2 = new daily("Golf", cal2);
		
		Calendar cal3 = Calendar.getInstance();
		cal3.set(Calendar.HOUR,10);
		cal3.set(Calendar.MINUTE,30);
		cal3.set(Calendar.MONTH, 10);
		cal3.set(Calendar.DAY_OF_MONTH, 10);
		monthly O3 = new monthly("Fishing", cal3);
		// everything above goes into setting the appointments and labels
		
		//tests if the appointment below matches with the O1 appointment, it should return true because all attributes are the same
		Calendar calTest1 = Calendar.getInstance();
		calTest1.set(Calendar.HOUR,8);
		calTest1.set(Calendar.MINUTE,30);
		calTest1.set(Calendar.MONTH, 4);
		calTest1.set(Calendar.DAY_OF_MONTH, 21);
		
		System.out.println(O1.checkAppointment(calTest1));

		
	}
}
