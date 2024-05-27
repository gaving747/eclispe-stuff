package edu.ilstu.it287.lab03.gegarc3;
import java.text.NumberFormat;

public class Employee {
	private String employeeName;
	private double currentSalary;
	
	public Employee(String employeeName, double currentSalary)
	{
		this.employeeName = employeeName;
		this.currentSalary = currentSalary;
	}
	
	public String getName()
	{
		return employeeName;
	}
	
	public double getSalary()
	{
		return currentSalary;
	}
	
	public void raiseSalary(double percent)
	{
		double increaseAmount = percent / 100;
		
		this.currentSalary = currentSalary + (currentSalary * increaseAmount);
		
	}
	
	public static void main (String[] args) 
	{
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		Employee harry = new Employee("Hacker, Harry", 50000);
		System.out.println(harry.getName());
		System.out.println(defaultFormat.format(harry.getSalary()));
		System.out.println("Salary after adjustment:");
		harry.raiseSalary(10); // Harry gets a 10 percent raise
		System.out.println(defaultFormat.format(harry.getSalary()));
		System.out.println("//////");
		Employee jenny = new Employee("Hacker, Jenny", 60000);
		System.out.println(jenny.getName());
		System.out.println(defaultFormat.format(jenny.getSalary()));
		jenny.raiseSalary(20); // Harry gets a 10 percent raise
		System.out.println("Salary after adjustment:");
		System.out.println(defaultFormat.format(jenny.getSalary()));
	}
	
}


