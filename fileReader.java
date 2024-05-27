package edu.ilstu.it287.lab12.gegarc3;
import java.io.*;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class fileReader {
	public static void main (String[] args) throws IOException
	{
		//input file
        File file = new File("stuff.txt");
        //tree instantiation
        TreeSet<String> words = new TreeSet<>();
        //file reader
        BufferedReader br = new BufferedReader(new FileReader(file));
        //map instantiation
        Map<Integer, ArrayList<String>> sm = new HashMap<Integer, ArrayList<String>>();
        String st;
        String st2 = "";
        //read each line from the file
        while ((st = br.readLine()) != null)
        {
        	//for each character in the line
            for(int i = 0; i < st.length(); i++)
            {
            	//if the character is not a space then add letter to current word
            	if(st.charAt(i) != ' ')
            	{
            		st2 += st.charAt(i);
            	}
            	
            	else
            	{
            		//if it is a space
            		if(st2 != "")
            		{
            			//add word to tree
            			words.add(st2);
            			//add word to map
            			if(sm.get(st2.length()) == null)
            			{
            				//accounts for words of the same letter length
            				sm.put(st2.length(),  new ArrayList<String>());
            				sm.get(st2.length()).add(st2);
            			}
            			else
            			{
            				sm.get(st2.length()).add(st2);
            			}
            		}
            		st2 = "";
            	}
            }
            if(st2 != "")
    		{
    			//same code as above
    			words.add(st2);
    			if(sm.get(st2.length()) == null)
    			{
    				sm.put(st2.length(),  new ArrayList<String>());
    				sm.get(st2.length()).add(st2);
    			}
    			else
    			{
    				sm.get(st2.length()).add(st2);
    			}
    		}
            st2 = "";
        }
        //prints contents of tree
        for(String w : words)
        {
        	System.out.println(w);
        }
        //prints size of tree
        System.out.println(words.size() + " different words");
        System.out.println("//////");
        //prints contents of map
        for (Integer key : sm.keySet()) { 
            System.out.println("Key: " + key + ", Value: " + sm.get(key)); 
        } 
	}

}
