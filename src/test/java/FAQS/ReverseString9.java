package FAQS;

import java.util.Scanner;

public class ReverseString9
{
    public static void main(String[] args)
    {
    	String input = "Sudhakar"; 
    	  
        // convert String to character array 
        // by using toCharArray 
        char[] try1 = input.toCharArray(); 
  
        for (int i = try1.length-1; i>=0; i--) 
            System.out.print(try1[i]); 
    }
}