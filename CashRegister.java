package edu.ilstu.it287.lab08.gegarc3;
import java.math.BigDecimal; 
/**
A cash register totals up sales and computes change due.
*/
public class CashRegister
{
	private double purchase;
	private double payment;
	/**
	Constructs a cash register with no money in it.
	*/
	//constructor for cash register
	public CashRegister()
	{
		purchase = 0;
		payment = 0;
	}
	
	//coin class
	public class Coin
	{
		private String name;
		private double value;
		//constructor
		public Coin(String a, double b)
		{
			this.name = a;
			this.value = b;
		}
		//returns the value of the coin
		public double getValue()
		{
			return value;
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
	public int giveChange(Coin coin)
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
		return numCoins;
		
	}
	
	public static void main (String[] args)
	{
		CashRegister C1 = new CashRegister();
		CashRegister.Coin quarter = new CashRegister().new Coin("quarter", 0.25);
		CashRegister.Coin penny = new CashRegister().new Coin("penny", 0.01);
		CashRegister.Coin nickel = new CashRegister().new Coin("nickel", 0.05);
		CashRegister.Coin dime = new CashRegister().new Coin("dime", 0.1);
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
		System.out.println("Number of quarters: " + C1.giveChange(quarter));
		//should giive 2- pennies
		System.out.println("Number of pennys: " + C1.giveChange(penny));
	}
}
