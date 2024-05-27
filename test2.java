package edu.ilstu.it287.lab09.gegarc3;
//gives object a name and salary
class employee
{
	String name;
	int salary;
	public employee(String a, int b)
	{
		this.name = a;
		this.salary = b;
	}
}
//extends employee, also gives them a department
class manager extends employee
{
	String department;
	public manager(String a, int b, String c)
	{
		//super constructor
		super(a,b);
		this.department = c;
	}
	
	public String toString()
	{
		String output = "Name: " + name + " salary: " + salary + " department: " + department + "\n";
		return output;
	}
}
//extends manager, has same attributes as manager
class executive extends manager
{
	public executive(String a, int b, String c)
	{
		//super constructor
		super(a,b,c);
	}
	public String toString()
	{
		String output = "Name: " + name + " salary: " + salary + " department: " + department + "\n";
		return output;
	}
}



public class test2 {
	public static void main(String[] args)
	{
		employee E1 = new employee("Allen", 100000);
		manager M1 = new manager("Harvey", 200000, "technology");
		executive Ex1 = new executive("James", 300000, "technology");
		System.out.println(M1.toString());
		System.out.println(Ex1.toString());
	}
}
