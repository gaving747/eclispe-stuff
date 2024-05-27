package edu.ilstu.it287.lab10.gegarc3;
import java.math.BigDecimal; 
import java.io.*;
import java.util.*;
/**
A cash register totals up sales and computes change due.
*/


public class coins
{
	private double purchase;
	private double payment;
	/**
	Constructs a cash register with no money in it.
	*/
	//constructor for cash register
	public coins()
	{
		purchase = 0;
		payment = 0;
	}
	
	//coin class
	public class Coin implements Comparable<Coin>
	{
		private String name;
		private double value;
		private int number;
		private int rank;
		//constructor
		public Coin(String a, double b)
		{
			this.name = a;
			this.value = b;
			this.number = 0;
			this.rank = 0;
		}
		//returns the value of the coin
		//returns coins value
		public double getValue()
		{
			return value;
		}
		//compare methods, compares the values of two coins
		public int compareTo(Coin o) 
		{
			// TODO Auto-generated method stub
			if(this.getValue() > o.getValue())
			{
				this.rank++;
				return 1;
			}
			else
			{
				return 0;
			}
	
		}
		 
	}
	/**
	Records the purchase price of an item.
	@param amount the price of the purchased item
	*/
	//adds the purchase
	public void recordPurchase(double amount)
	{
		
		purchase = purchase + amount;
		
		
	}
	/**
	Enters the payment received from the customer.
	@param coinCount the number of coins received
	@param coinType the type of coin that was received
	*/
	//adds to the payment
	public void receivePayment(int coinCount, Coin coinType)
	{
		
		payment = payment + coinCount * coinType.getValue();
		
		
	}
	/**
	Computes the change due and resets the machine for the next customer.
	@return the change due to the customer
	*/
	//subtracts the amount of a specific coin as much as it can without the change going into the negatives
	int giveChange(Coin coin)
	{
		int numCoins = 0;
		double change = payment - purchase;
		//purchase = 0;
		//payment = 0;
		
		while(change >= coin.getValue())
		{
			change = change - coin.getValue();
			numCoins++;
		}
		//so the change value does not reset after that instance
		if(change == 0)
		{
			payment = 0;
		}
		else
		{
			payment = change;
			purchase = 0;
		}
		coin.number = numCoins;
		return numCoins;
		
	}

	
	
	public static void main (String[] args)
	{
		coins C1 = new coins();
		coins.Coin quarter = new coins().new Coin("quarter", 0.25);
		coins.Coin penny = new coins().new Coin("penny", 0.01);
		coins.Coin nickel = new coins().new Coin("nickel", 0.05);
		coins.Coin dime = new coins().new Coin("dime", 0.1);
		C1.recordPurchase(1.0);
		C1.recordPurchase(0.5);
		C1.recordPurchase(0.03);
		C1.receivePayment(6, quarter);
		C1.receivePayment(3, penny);
		///////
		C1.receivePayment(1, quarter);
		C1.receivePayment(2, nickel);
		C1.receivePayment(1, dime);
		/////
		//should give one quarter
		C1.giveChange(quarter);
		//should give 2- pennies
		C1.giveChange(penny);
		
		//the code below calculates the rank of each coin, puts each coin in a list, and sorts according the rank
		quarter.compareTo(dime);
		quarter.compareTo(nickel);
		quarter.compareTo(penny);
		
		penny.compareTo(quarter);
		penny.compareTo(nickel);
		penny.compareTo(dime);
		
		nickel.compareTo(quarter);
		nickel.compareTo(dime);
		nickel.compareTo(penny);
		
		dime.compareTo(quarter);
		dime.compareTo(nickel);
		dime.compareTo(penny);
		
		Coin coinArray[] = new Coin[4];
		coinArray[0] = quarter;
		coinArray[1] = penny;
		coinArray[2] = dime;
		coinArray[3] = nickel;
		//bubble sort to sort coin value from biggest so smallest
		 int n = coinArray.length;
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                 if (coinArray[j].rank < coinArray[j + 1].rank) {
                     // Swap myArray[j] and myArray[j+1]
                     Coin temp = coinArray[j];
                     coinArray[j] = coinArray[j + 1];
                     coinArray[j + 1] = temp;
                 }
             }
         }
         
         for(int i = 0; i < n; i++)
         {
        	 System.out.println(coinArray[i].name + ": " + coinArray[i].number);
         }
	}
	
}
