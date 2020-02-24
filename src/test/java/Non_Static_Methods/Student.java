package  Non_Static_Methods;


public class Student
{  
		
		 // Non Static members
		 int rollno;  
		 String name; 
	
	 
		 
		 //Static Members data is global data 
		 static String college = "VBIT  College"; 
	
		 
		 //global data change
		public static void change() throws Exception
		{  
		 college = "VBIT  College Atonomous";   
		 }  

		 //Method Name is same as class name , hence the below method is called as Constructor 
		 // Constructor is used to  initialize object 
		 Student(int r, String n){  
		 rollno = r;  
		 name = n;  
		 
		
		 }  

		 
		// Non static method 
		public void display ()
		{
			System.out.println(rollno+" "+name+" "+college);	

		}  

		
		//Program Execution starts from main methods in any Java program
		public static void main(String args[]) throws Exception{  
		{
	
			Student.change();  
	
			// S1,S2,S3 objects created with data
			Student s1 = new Student (111,"Ravi");  
			Student s2 = new Student (222,"Raj");  
			Student s3 = new Student (333,"Roy");  
	
			s1.display();  
			s2.display();  
			s3.display();  
		}  
		}
		
}