package Day014_SingleInheritence;

interface  interfaceA1 {

	public  void Hello() ;
	
}


class By_using_interface implements interfaceA1
{
	
	public static void main(String args[])
	{
		interfaceA1 A1= new By_using_interface();
		A1.Hello();
		
		
	}
	

	public  void Hello()
	{
		System.out.println("Hai");
		
	}
	
}




