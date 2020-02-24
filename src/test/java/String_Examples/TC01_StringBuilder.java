package String_Examples;

import java.util.Scanner;

public class TC01_StringBuilder {

	public static void main(String args[]){  
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		}  
	
}
