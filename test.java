package edu.ilstu.it287.lab09.gegarc3;

//person class that has a name and birthyear
class Person 
{
	
	String name;
	int birthYear;
	
	public Person(String a, int b)
	{
		this.name = a;
		this.birthYear = b;
	}
	
	public String toString()
	{
		String output = "Name: " + name + " Birthdate: " + birthYear + "\n";
		return output;
	}
	
}
//extends person class but also gives them a major
class student extends Person
{
	String major;
	public student(String a, int b, String c)
	{
		//super constructor
		super(a,b);
		this.major = c;
	}
	//prints attributes
	public String toString()
	{
		String output = "Name: " + name + " Birthdate: " + birthYear + " Salary: " + major + "\n";
		return output;
	}
}
//extends person but also gives them a salary
class instructor extends Person
{
	int salary;
	public instructor(String a, int b, int c)
	{
		//super constructor
		super(a,b);
		this.salary = c;
	}
	//prints attributes
	public String toString()
	{
		String output = "Name: " + name + " Birthdate: " + birthYear + " Salary: " + salary + "\n";
		return output;
	}
}

public class test {
	public static void main(String[]args)
	{
		student s1 = new student("Allen", 2003, "Compsci");
		System.out.println(s1.toString());
		instructor i1 = new instructor("John", 1979, 150000);
		System.out.println(i1.toString());
		Person p1 = new Person("Gavin", 2003);
		System.out.println(p1.toString());
	}
}
