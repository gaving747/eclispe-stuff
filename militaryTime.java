package edu.ilstu.it287.lab04.gegarc3;
import java.util.Scanner; 
public class militaryTime {
	public static void main (String[] args)
	{
		//accepts the input for the two numbers
		Scanner myObj = new Scanner(System.in);
		System.out.println("Print out your first time:");
		int time1 = myObj.nextInt();
		System.out.println("Print out your second time:");
		int time2 = myObj.nextInt();
		
		if(time2 > time1)
		{
			//two times combined, but I removed the minutes
			int part1 = (time1 / 100) * 100;
			int part2 = (time2 / 100) * 100;
			int difference = part2 - part1;
			int hours = 0;
			int minutes = 0;
			int minutesPart1 = 0;
			int minutesPart2 = 0;
			int tempMinutes = 0;
			
			hours = difference / 100;
			//places the remaining minutes in for the minutes
			minutesPart1 = time1 - part1;
			minutesPart2 = time2 - part2;
			tempMinutes = minutesPart2 - minutesPart1;
			//if the temp minutes are negative, then I subtract one from the hours and add that negative amount to 60
			//if not negative, then I simply place the amount of minutes onto minutes
			if(tempMinutes >= 0)
			{
				minutes += tempMinutes;
			}
			else
			{
				hours = hours - 1;
				minutes = 60 + tempMinutes;
			}
			
			System.out.println(hours + " hours and " + minutes + " minutes.");
		}
		
		else if(time2 < time1)
		{
			int hours = 0;
			int minutes = 0;
			int hours2 = 0;
			int minutes2 = 0;
			int totalHours = 0;
			int totalMinutes = 0;
			int part1 = time2;
			//take out the minutes from the first time value
			int tempPart2 = (time1 / 100) * 100;
			tempPart2 = (2400 - tempPart2) - 40 - (time1 - tempPart2);
			int part2 = tempPart2;
			//for both parts one and two, counts how many hours are in each part and adds the minutes accordingly
			while(part2 >= 100)
			{
				hours ++;
				part2 = part2 - 100;
			}
			if(part2 >= 60)
			{
				hours++;
				minutes = part2 - 60;
			}
			else
			{
				minutes = part2;
			}
			
			while(part1 >= 100)
			{
				hours2 ++;
				part1 = part1 - 100;
			}
			if(part1 >= 60)
			{
				hours2++;
				minutes2 = part1 - 60;
			}
			else
			{
				minutes2 = part1;
			}
			
			totalHours = hours + hours2;
			totalMinutes = minutes + minutes2;
			//if the total minutes is greater than 60 add to the hours and subtract 60 from the minutes
			if(totalMinutes >= 60)
			{
				totalHours++;
				totalMinutes = totalMinutes - 60;
			}
			
			System.out.println(totalHours + " hours and " + totalMinutes + " minutes.");
			
		}
		//if the times are equal, then print 0 for both 
		else
		{
			System.out.println("0 hours and 0 minutes");
		}
		
	}
}
