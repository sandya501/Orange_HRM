package FAQS;

public class ReverseString11
{
    public static void main(String[] args)
    {
    	String str = "Sudhakar Hello",reverse="" ; 

        for (int i = str.length()-1; i>=0; i--) 
        {
        	reverse=reverse+str.charAt(i);
         
        }
        System.out.print("Reverse String is : " +reverse); 
        
    }
}