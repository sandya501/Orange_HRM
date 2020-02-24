package  StaticMethods_Example;


public class Circle
{  
		
	int r;
	double area;
	
    static double pi = 3.14;
   
    
    Circle(int r){  
        area =  (pi * r * r);
       // System.out.println("Area of circle:"+area); 
    }
    
    
    //global static  pi value change
	public static void pi_value_change(double pi_value){  
	 pi = pi_value;   
	 System.out.println("Pi value after change :"+pi); 
	 }  
    
	
	// Non static method 
	public void areaofcircle()
	{
		 System.out.println("Area of circle:"+area);	

	}  
    
		//Program Execution starts from main methods in any Java program
		public static void main(String args[])
		{
			
			Circle c1= new Circle(2);
			c1.areaofcircle();
			
			Circle c2= new Circle(3);
			c2.areaofcircle();
			
			Circle.pi_value_change(3.15);
			
			Circle c3= new Circle(2);
			c3.areaofcircle();
			

		}  
		
		
}