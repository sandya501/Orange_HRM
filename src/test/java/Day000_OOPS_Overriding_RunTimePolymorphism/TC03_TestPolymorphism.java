package Day000_OOPS_Overriding_RunTimePolymorphism;

//Note: This example is also given in method overriding but there was no upcasting.
//https://www.javatpoint.com/runtime-polymorphism-in-java

class Bank
{  
	public float getRateOfInterest() throws Exception
	{
		return 0;
	}  
}  

class SBI extends Bank 
{  
	public float getRateOfInterest() throws Exception
	{
		return 8.4f;
	}  
	
}  

class ICICI extends Bank
{  
	public float getRateOfInterest() throws Exception
	{
		return 7.3f;
	}  
}  

class AXIS extends Bank
{  
	public float getRateOfInterest() throws Exception
	{
		return 9.7f;
	}  
}  


class TC03_TestPolymorphism
{  
	
	public static void main(String args[]) throws Exception
	{  
		
		Bank b;  
		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest()); 
		
	}  
}  

