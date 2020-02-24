package String_Examples;

public class TC01_String {

	public static void main(String args[]){  
		   String s="Sachin";  
		   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   
		  String  str=s.concat(" Tendulkar");;
		  System.out.println(str);//will print Sachin because strings are immutable objects
		  
		   System.out.println(s);//will print Sachin because strings are immutable objects  
		 }  
	
}
