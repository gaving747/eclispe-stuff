package edu.ilstu.it287.pgm02.gegarc3;

class LetterPrinter 
{
	public String from;
	public String who;
	public String text = "";
	public String formatedText2 = "";
	
	public LetterPrinter(String from, String who)
	{
		this.from = from;
		this.who = who;
	}
	
	public void addLine(String line)
	{
		text = text.concat(line).concat("\n");
	}
	
	public String getTest2() 
	{
		formatedText2 = formatedText2.concat("Dear " + who + ":" + "\n");
		formatedText2 = formatedText2.concat(text);
		formatedText2 = formatedText2.concat("Sincerely," + "\n");
		formatedText2 = formatedText2.concat(from);
		return formatedText2;
	}

}


public class Letter 
{
	public String from;
	public String who;
	public String text = "";
	public String formatedText = "";
	
	public Letter(String from, String who)
	{
		this.from = from;
		this.who = who;
	}
	
	public void addLine(String line)
	{
		text = text.concat(line).concat("\n");
	}
	
	public String getTest() 
	{
		formatedText = formatedText.concat("Dear " + who + ":" + "\n");
		formatedText = formatedText.concat("\n");
		formatedText = formatedText.concat(text);
		formatedText = formatedText.concat("\n");
		formatedText = formatedText.concat("Sincerely," + "\n");
		formatedText = formatedText.concat("\n");
		formatedText = formatedText.concat(from);
		return formatedText;
	}
	
	
	public static void main (String[] args) 
	{
		Letter letter = new Letter("Gavin", "Thomas");
		letter.addLine("Thomas please,");
		letter.addLine("stop watching anime at full volume at 2am!");
		System.out.println(letter.getTest());
		System.out.println("");
		LetterPrinter letter2 = new LetterPrinter("Mary", "John");
		letter2.addLine("I am sorry we must part.");
		letter2.addLine("I wish you the best.");
		System.out.println(letter2.getTest2());
	}
	
}





