package String_Examples;

import java.util.Scanner;

public class TC01_StringBuffer {

	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		}  
	
}
