package edu.ilstu.it287.pgm05.gegarc3;

public class minivan {
	
	//each individual variable
	int rightInsideDoorHandle;
	int leftInsideDoorHandle;
	int rightOutsideDoorHandle;
	int leftOutsideDoorHandle;
	int rightDashboardSwitch;
	int leftDashboardSwitch;
	int childLock;
	int masterUnlock;
	char gear;
	boolean rightDoorOpen;
	boolean leftDoorOpen;
	String RO = "right door is open";
	String RC = "right door is closed";
	String LO = "left door is open";
	String LC = "left door is closed";
	//constructor accepts variables from above 
	public minivan(int a, int b, int c, int d, int e , int f, int g, int h, char i)
	{
		rightDashboardSwitch = a;
		leftDashboardSwitch = b;
		childLock = c;
		masterUnlock = d;
		rightInsideDoorHandle = e;
		leftInsideDoorHandle = f;
		rightOutsideDoorHandle = g;
		leftOutsideDoorHandle = h;
		gear = i;
	}
	
	public void printDoorCondition()
	{
		//if the master lock is activated and the car is in park
		if(masterUnlock == 1 && gear == 'P')
		{
			//if the child lock is on then don't open the door if only the inside door handle is being toggled
			if(childLock == 1)
			{
				if(rightOutsideDoorHandle == 0 && rightDashboardSwitch == 0)
				{
					rightDoorOpen = false;
				}
				else
				{
					rightDoorOpen = true;
				}
				
				if(leftOutsideDoorHandle == 0 && leftDashboardSwitch == 0)
				{
					leftDoorOpen = false;
				}
				else
				{
					leftDoorOpen = true;
				}
				
			}
			//if the child lock is not on, then open the door if any of the controls are being used
			else
			{
				if(rightInsideDoorHandle == 1 || rightOutsideDoorHandle == 1 || rightDashboardSwitch == 1)
				{
					rightDoorOpen = true;
				}
				else
				{
					rightDoorOpen = false;
				}
				if(leftInsideDoorHandle == 1 || leftOutsideDoorHandle == 1 || leftDashboardSwitch == 1)
				{
					leftDoorOpen = true;
				}
				else
				{
					leftDoorOpen = false;
				}
			}
		}
		
		//if the car is not in park and the master lock is not activated then keep the doors closed
		else
		{
			rightDoorOpen = false;
			leftDoorOpen = false;
		}
		//code below prints out the result
		if(rightDoorOpen == true)
		{
			System.out.println(RO);
		}
		else
		{
			System.out.println(RC);
		}
		
		if(leftDoorOpen == true)
		{
			System.out.println(LO);
		}
		else
		{
			System.out.println(LC);
		}
	}
	
	
	public static void main(String[] args)
	{
		//should say that both doors are closed
		minivan M1 = new minivan(1,1,1,0,1,1,1,1,'P'); 
		//should say the doors are closed
		minivan M2 = new minivan(1,1,1,1,1,1,1,1,'D'); 
		//should say that the doors are open
		minivan M3 = new minivan(1,0,0,1,0,1,0,0,'P');
		//should say that only the right door is open
		minivan M4 = new minivan(1,0,1,1,0,1,0,0,'P');
		M1.printDoorCondition();
		System.out.println();
		M2.printDoorCondition();
		System.out.println();
		M3.printDoorCondition();
		System.out.println();
		M4.printDoorCondition();
	}
}
