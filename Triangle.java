package edu.ilstu.it287.pgm04.gegarc3;
import java.lang.Math;
public class Triangle {
	int x1, y1, x2, y2, x3, y3;
	double side1 = 0;
	double side2 = 0;
	double side3 = 0;
	double perimiter = 0;
	double area = 0;
	double angle1 = 0;
	double angle2 = 0;
	double angle3 = 0;
	//constructor that accepts the points
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	//functions below compute the side lengths
	void computeSide1()
	{
		side1 = Math.sqrt((x2 - x1)*(x1 - x1) + (y2 - y1)*(y2 - y1));
	}
	
	void computeSide2()
	{
		side2 = Math.sqrt((x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1));
	}
	
	void computeSide3()
	{
		side3 = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2));
	}
	//computes the perimiter
	void computePerimiter()
	{
		perimiter = side1 + side2 + side3;
	}
	//computes the area
	void computeArea()
	{
		area = Math.sqrt(perimiter*(perimiter - side1)*(perimiter - side2)*(perimiter - side3));
	}
	//functions below calculate each angle
	void computeAngle1()
	{
		double temp = (side1*side1 + side2*side2 - side3*side3)/(2*side1*side2);
		angle1 = Math.acos(temp)* (180 / 3.1415);
		
	}
	
	void computeAngle2()
	{
		double temp = (side1*side1 + side3*side3 - side2*side2)/(2*side1*side3);
		angle2 = Math.acos(temp)* (180 / 3.1415);
	}
	
	void computeAngle3()
	{
		double temp = (side3*side3 + side2*side2 - side1*side1)/(2*side3*side2);
		angle3 = Math.acos(temp)* (180 / 3.1415);
	}
	
	public static void main(String[]args)
	{
		//triangle object
		Triangle t1 = new Triangle(0,0,0,5,3,3);
		t1.computeSide1();
		t1.computeSide2();
		t1.computeSide3();
		//prints sides
		System.out.println("Side 1: " + t1.side1);
		System.out.println("Side 2: " + t1.side2);
		System.out.println("Side 3: " + t1.side3);
		t1.computePerimiter();
		t1.computeArea();
		//prints perimiter and area
		System.out.println("Perimiter: " + t1.perimiter);
		System.out.println("Area: " + t1.area);
		t1.computeAngle1();
		t1.computeAngle2();
		t1.computeAngle3();
		//prints angles
		System.out.println("Angle 1: " + t1.angle1);
		System.out.println("Angle 2: " + t1.angle2);
		System.out.println("Angle 3: " + t1.angle3);
		
	}
}
