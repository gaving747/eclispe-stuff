package edu.ilstu.it287.pgm03.gegarc3;

public class CircuitTester 
{
	//variables
	public static int firstSwitchState = 0;
	public static int secondSwitchState = 0;
	public static int lightState = 0;
	//returns first switch state
	public static int getFirstSwitchState() 
	{
		return firstSwitchState;
	}
	//returns second switch state
	public static int getSecondSwitchState()
	{
		return secondSwitchState;
	}
	//returns light state
	public static int getLightState()
	{
		return lightState;
	}
	//if the switch is being turned on, then turn on the light, otherwise turn it off
	public static void toggleFirstSwitch()
	{
		if(firstSwitchState == 1)
		{
			firstSwitchState = 0;
		}
		
		else if(firstSwitchState == 0)
		{
			firstSwitchState = 1;
		}
		
		if(firstSwitchState == 1)
		{
			lightState = 1;
		}
		
		else if(firstSwitchState == 0)
		{
			lightState = 0;
		}
	}
	//if the switch is being turned on, then turn on the light, otherwise turn it off
	public static void toggleSecondSwitch()
	{
		if(secondSwitchState == 1)
		{
			secondSwitchState = 0;
		}
		
		else if(secondSwitchState == 0)
		{
			secondSwitchState = 1;
		}
		
		if(secondSwitchState == 1)
		{
			lightState = 1;
		}
		
		else if(secondSwitchState == 0)
		{
			lightState = 0;
		}
	}
	//return the switch state of the desired switch
	public static int getSwitchState(int switchNumber)
	{
		if(switchNumber == 1)
		{
			return getFirstSwitchState();
		}
		
		else
		{
			return getSecondSwitchState();
		}
	}
	//toggle the desired switch
	public static void toggleSwitch(int switchNumber)
	{
		if(switchNumber == 1)
		{
			toggleFirstSwitch();
		}
		
		else if(switchNumber == 2)
		{
			toggleSecondSwitch();
		}
	}
	
	public static void main(String[]args)
	{
		toggleFirstSwitch();
		System.out.println(getLightState());
		toggleFirstSwitch();
		System.out.println(getLightState());
		toggleSecondSwitch();
		System.out.println(getLightState());
		toggleFirstSwitch();
		System.out.println(getLightState());
		toggleSecondSwitch();
		System.out.println("By now the light state should be off");
		System.out.println(getLightState());
		System.out.println("The first switch should be on");
		System.out.println(getFirstSwitchState());
		System.out.println("The second switch should be off");
		System.out.println(getSecondSwitchState());
		System.out.println("Should print out that the first switch state is on");
		System.out.println(getSwitchState(1));
		toggleSwitch(2);
		System.out.println("Should print out that the second switch is now on");
		System.out.println(getSwitchState(2));
		
	}
}

