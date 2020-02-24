package FAQS;

import java.util.Scanner;

public class ReverseString10
{
    public static void main(String[] args)
    {
    	String str = "Sudhakar Hai"; 
    	
    	
    	int stringlength=str.length();

  
        for (int i = stringlength-1; i>=0; i--) 
        {
            System.out.print(str.charAt(i)); 
        }
    }
}