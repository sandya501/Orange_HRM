package Day000_OOPS_Overriding_RunTimePolymorphism;

//Rule: Runtime polymorphism can't be achieved by data members.

class Bike
{  
	 int speedlimit=90;  
}  

class TC04_Honda3 extends Bike
{  

	 int speedlimit=150;  
	 
	 public static void main(String args[])throws Exception
	 {  
	  Bike obj=new TC04_Honda3();  
	  System.out.println(obj.speedlimit);//90  
	 }
	  
}  