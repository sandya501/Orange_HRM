package Day015_Multi_Level_Inheritence;

interface  interfaceA1 {

	public  void Hello() ;
	
}


interface  interfaceB1 {

	public  void Hai() ;
	
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




