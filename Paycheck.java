package edu.ilstu.it287.lab05.gegarc3;
import java.text.NumberFormat;
import java.util.Scanner; 
public class Paycheck {
	NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
	String name;
	double salary;
	double hours;
	//accepts the name, salary, and paycheck of a person
	public Paycheck(String name, double salary, double hours)
	{
		this.name = name;
		this.salary = salary;
		this.hours = hours;
	}
	
	double totalPaycheck = 0;
	double overtimeHours = 0;
	//prints out everything
	void getPaycheck()
	{
		//if the person worked overtime, make the necessary adjustments to the paycheck
		if(hours > 40)
		{
			overtimeHours = hours - 40;
			hours = 40;
			totalPaycheck += overtimeHours * (salary * 1.5);
		}
		totalPaycheck += hours * salary;
		//print everything out
		System.out.println(name + " has earned a total of " + defaultFormat.format(totalPaycheck));
	}
	
	
	public static void main (String[]args)
	{
		Scanner input1 = new Scanner(System.in);  // Create a Scanner object
		//asks for name
		System.out.println("Enter your name: ");
		String name = input1.nextLine();  // Read user input
		//assk for salary
		System.out.println("Enter your salary: ");
		double salary = input1.nextDouble();
		//asks for amount of hours
		System.out.println("Enter the hours you worked: ");
		double hours = input1.nextDouble();
		//creates object and exectues method
		Paycheck person1 = new Paycheck(name, salary, hours);
		person1.getPaycheck();
	}
}
