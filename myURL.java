package edu.ilstu.it287.lab12.gegarc3;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.net.URL;
public class myURL {
	
	public static void main(String[] args) throws IOException
	{
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter URL:");
		String myURL = myObj.nextLine();
		//checks if he url exists
		try
		{
			URL urlName = new URL(myURL);
		}
		catch(IOException e)
		{
			System.out.println("url not found");
			System.exit(0);
		}
		URL urlName = new URL(myURL);
		System.out.println("Enter in the file name to write into:");
		String fileName = myObj.nextLine();
		File file = new File(fileName);
		//checks if the file exists
		if(!new File(fileName).exists())
		{
			System.out.println("This file does not exist");
			System.exit(0);
		}
		
		//switches the output from the console to the file
        Scanner scan = new Scanner(urlName.openStream());
        String content = new String();
        PrintStream stream = new PrintStream(file);
        System.setOut(stream);
        //goes through each line in the website and writes it in the file
        while (scan.hasNext())
        {
           content = scan.nextLine();
           System.out.println(content);
           
        }
        scan.close();
		
	}
}
