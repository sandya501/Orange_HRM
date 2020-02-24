package Day000_OOPS_Overriding_RunTimePolymorphism;

//Rule: Runtime polymorphism can't be achieved by data members.

class Shape
{  
	public void draw() throws Exception
	{
		System.out.println("drawing...");
	}  
}  


class Rectangle extends Shape
{  
	public void draw() throws Exception
	{
		System.out.println("drawing rectangle...");
	}  
}  


class Circle extends Shape
{  
	public void draw() throws Exception
	{
		System.out.println("drawing circle...");
	}  
}  


class Triangle extends Shape
{  
	public void draw() throws Exception
	{
		System.out.println("drawing triangle...");
	}  
}  

class TC05_TestPolymorphism2
{ 
		
		public static void main(String args[])throws Exception
		{  
			Shape s;  
			
			s=new Rectangle();  
			s.draw();  
			
			s=new Circle();  
			s.draw();  
			
			s=new Triangle();  
			s.draw();  
		}  
	
}  