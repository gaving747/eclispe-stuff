package edu.ilstu.it287.lab06.gegarc3;

public class lineLoop {
	//prints all the capitals in a string
	public static void printCapitals(String word)
	{
		//searches through the string and checks if the character is a capital or not
		for(int i = 0; i < word.length(); i++)
		{
			if(Character.isUpperCase(word.charAt(i)))
			{
				System.out.print(word.charAt(i) + ", ");
			}
		}
		System.out.println();
	}
	//prints the charater of every second word in the string
	public static void everySecond(String sentence)
	{
		boolean string = false;
		//traverses through the string except for the last letter
		for(int i = 0; i < sentence.length() - 1; i++)
		{
			//if it is a space, thenisWhitespace is false
			if(Character.isWhitespace(sentence.charAt(i)))
			{
				if(string == true)
				{
					string = false;
				}
				
			}
			//if it is not a space, and a new word is found, print the letter right next to it
			if(!(Character.isWhitespace(sentence.charAt(i))))
			{
				if(string == false)
				{
					string = true;
					
					if(!(Character.isWhitespace(sentence.charAt(i+1))))
					{
						System.out.print(sentence.charAt(i+1) + ", ");
					}
				}
			}
			
		}
		System.out.println();
	}
	//prints an underscore next to the vowels
	public static void vowelUnderscore(String sentence)
	{
		//if it is an aeiou, then print the underscore next to it
		for(int i = 0; i < sentence.length(); i++)
		{
			if(sentence.charAt(i) == 'A' || sentence.charAt(i) == 'E' || sentence.charAt(i) == 'I' || sentence.charAt(i) == 'O' || sentence.charAt(i) == 'U' || sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u')
			{
				System.out.print("_" + sentence.charAt(i));
			}
			
			else
			{
				System.out.print(sentence.charAt(i));
			}
		}
		System.out.println();
	}
	//print the number of vowels
	public static void numberOfVowels(String sentence)
	{
		int numVowels = 0;
		//if it is an aeiou, then add 1 to the numVowels
		for(int i = 0; i < sentence.length(); i++)
		{
			if(sentence.charAt(i) == 'A' || sentence.charAt(i) == 'E' || sentence.charAt(i) == 'I' || sentence.charAt(i) == 'O' || sentence.charAt(i) == 'U' || sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u')
			{
				numVowels++;
			}
		}
		System.out.println(numVowels);
	}
	//prints the position of vowels
	public static void positionOfVowels(String sentence)
	{
		//if it is an aeiou, then print the i position of that letter
		for(int i = 0; i < sentence.length(); i++)
		{
			if(sentence.charAt(i) == 'A' || sentence.charAt(i) == 'E' || sentence.charAt(i) == 'I' || sentence.charAt(i) == 'O' || sentence.charAt(i) == 'U' || sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u')
			{
				System.out.print(i + ", ");
			}
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args)
	{
		printCapitals("GavinGarcIa HellO");
		everySecond("Hello there I am Gavin Hi");
		vowelUnderscore("My name is Gavin");
		numberOfVowels("My name is Gavin Garcia");
		positionOfVowels("My name is Gavin Garcia");
	}
}
