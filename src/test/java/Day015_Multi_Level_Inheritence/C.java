package Day015_Multi_Level_Inheritence;

class  A {

	public  void Hello()
	{
		System.out.println("Hello");
		
	}
	
}

class  B extends A {

	public  void Hai()
	{
		System.out.println("Hai");
		
	}
	
}


class C extends B
{
	
	public static void main(String args[])
	{
		
		 C C1= new C();
		 
		 C1.Hai();
		 C1.Hello();
		 C1.Welcome();
		
	}
	

	public  void Welcome()
	{
		System.out.println("Welcome");
		
	}
	
}




