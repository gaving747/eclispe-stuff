package edu.ilstu.it287.pgm08.gegarc3;

public class resistor {
	
	double resistance;
	double tolerance;
	public resistor(double resistance, double tolerance)
	{
		this.resistance = resistance;
		this.tolerance = tolerance;
	}
	//returns resistance
	public double getResistance()
	{
		return this.resistance;
	}
	//returns tolerance
	public double getTolerance()
	{
		return this.tolerance;
	}
	//returns random value between highest resistor value and lowest resistor value
	public static double getRandomValue(resistor R1)
	{
		double value = R1.resistance * (R1.tolerance * 0.01);
		double lowValue = R1.resistance - value;
		double highValue = R1.resistance + value;
		double answer = Math.floor(Math.random() *(highValue - lowValue + 1) + lowValue);
		return answer;
	}
	
	public static String getColorCode(resistor R1)
	{
		String answer = "";
		int power = 0;
		String rConversion = String.valueOf(R1.resistance);
		//checks the first number and assigns the appropriate color
		if(rConversion.charAt(0) == '1')
		{
			answer += "brown, ";
		}
		else if(rConversion.charAt(0) == '2')
		{
			answer += "red, ";
		}
		else if(rConversion.charAt(0) == '3')
		{
			answer += "orange, ";
		}
		else if(rConversion.charAt(0) == '4')
		{
			answer += "yellow, ";
		}
		else if(rConversion.charAt(0) == '5')
		{
			answer += "green, ";
		}
		else if(rConversion.charAt(0) == '6')
		{
			answer += "blue, ";
		}
		else if(rConversion.charAt(0) == '7')
		{
			answer += "violet, ";
		}
		else if(rConversion.charAt(0) == '8')
		{
			answer += "gray, ";
		}
		else if(rConversion.charAt(0) == '9')
		{
			answer += "white, ";
		}
		////////
		//checks the second number and assigns an appropriate color
		if(rConversion.charAt(1) == '1')
		{
			answer += "brown, ";
		}
		else if(rConversion.charAt(1) == '2')
		{
			answer += "red, ";
		}
		else if(rConversion.charAt(1) == '3')
		{
			answer += "orange, ";
		}
		else if(rConversion.charAt(1) == '4')
		{
			answer += "yellow, ";
		}
		else if(rConversion.charAt(1) == '5')
		{
			answer += "green, ";
		}
		else if(rConversion.charAt(1) == '6')
		{
			answer += "blue, ";
		}
		else if(rConversion.charAt(1) == '7')
		{
			answer += "violet, ";
		}
		else if(rConversion.charAt(1) == '8')
		{
			answer += "gray, ";
		}
		else if(rConversion.charAt(1) == '9')
		{
			answer += "white, ";
		}
		
		////////
		//checks the length and assigns the appropriate color
		if(rConversion.length() - 2 == 1)
		{
			answer += "brown, ";
		}
		else if(rConversion.length()- 2 == 2)
		{
			answer += "red, ";
		}
		else if(rConversion.length()- 2 == 3)
		{
			answer += "orange, ";
		}
		else if(rConversion.length()- 2 == 4)
		{
			answer += "yellow, ";
		}
		else if(rConversion.length()- 2 == 5)
		{
			answer += "green, ";
		}
		else if(rConversion.length()- 2 == 6)
		{
			answer += "blue, ";
		}
		else if(rConversion.length()- 2 == 7)
		{
			answer += "violet, ";
		}
		else if(rConversion.length()- 2 == 8)
		{
			answer += "gray, ";
		}
		else if(rConversion.length()- 2 == 9)
		{
			answer += "white, ";
		}
		////////
		//checks the resistance and assigns the appropriae color
		if(R1.tolerance == 5)
		{
			answer += "gold, ";
		}
		else if(R1.tolerance == 10)
		{
			answer += "silver, ";
		}
		return answer;
	}
	
	public static void main(String[]args)
	{
		resistor R1 = new resistor(330,10);
		System.out.println(R1.getResistance());
		System.out.println(R1.getTolerance());
		System.out.println(getRandomValue(R1));
		System.out.println(getColorCode(R1));
	}
}
