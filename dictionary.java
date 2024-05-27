package edu.ilstu.it287.pgm11.gegarc3;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
public class dictionary {
	
	//takes in a word and then checks if it is in the list or not
	public static void checkWord(String word) throws IOException
	{	
		Scanner sc2 = new Scanner(new FileInputStream("words.txt"));
		//searches the list for the word, if it is there then it returns and ends the method
		while(sc2.hasNextLine()) {
	         String line = sc2.nextLine();
	         if(word.equals(line))
	         {
	        	 return;
	         }
	      }
		System.out.println(word);
	}
	public static void main(String[] args) throws IOException
	{
		 Scanner sc1 = new Scanner(new FileInputStream("stuff2.txt"));
		 //puts each word through the check function
		 while(sc1.hasNextLine()) {
	         String line = sc1.nextLine();
	         checkWord(line);
	     }
	}
}
