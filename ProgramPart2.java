package edu.ilstu.it287.pgm10.gegarc3;
import java.text.NumberFormat;
public class ProgramPart2 {
	
	public interface NumberFormatter {
		String format(int n);
	}
	//simply prints out the string of the number
	static class DefaultFormatter implements NumberFormatter 
	{
		public String format(int n)
		{
			String t = Integer.toString(n);
			return t;
		}
	}
	//puts commas in the numbers and uses the proper format class
	static class DecimalSeparatorFormatter  implements NumberFormatter
	{
		public String format(int n)
		{
			//formatter
			NumberFormat myFormat = NumberFormat.getInstance();
			myFormat.setGroupingUsed(true);
			myFormat.format(n);
			String t = Integer.toString(n);
			t = myFormat.format(n);
			return t;
		}
	}
	//puts parenthesis around the number if it is negative
	static class AccountingFormatter implements NumberFormatter
	{
		public String format(int n)
		{
			String t = Integer.toString(n);
			String response;
			//checks if the value is negative
			if(n < 0)
			{
				response = "(" + t + ")";
				return response;
			}
			else
			{
				return t;
			}
		}
	}
	
	public static void main(String[]args)
	{
		DefaultFormatter d1 = new DefaultFormatter();
		DecimalSeparatorFormatter d2 = new  DecimalSeparatorFormatter();
		AccountingFormatter d3 = new AccountingFormatter();
		System.out.println(d1.format(1000));
		System.out.println(d2.format(1000));
		System.out.println(d3.format(-1000));
		
	}
}
