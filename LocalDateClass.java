package edu.ilstu.it287.pgm01.gegarc3;
import java.time.LocalDate;    

public class LocalDateClass {
	public static void main (String[] args) 
	{
		LocalDate today = LocalDate.now();
		LocalDate pieDay = today.minusDays(176);
		//System.out.print(MarchDate.getMonth() + " ");
		//System.out.println(MarchDate.getDayOfMonth());
		System.out.println(pieDay.getDayOfWeek());
		LocalDate firstDay = today.minusDays(248);
		LocalDate piDay = firstDay.plusDays(255);
		System.out.println(piDay + " " + piDay.getDayOfWeek());
		LocalDate yearsFromToday = today.minusDays(10000);
		System.out.print(yearsFromToday + " ");
		System.out.println(yearsFromToday.getDayOfWeek());
	}
}
