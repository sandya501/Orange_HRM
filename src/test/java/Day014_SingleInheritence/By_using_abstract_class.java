package Day014_SingleInheritence;

abstract class  interfaceB1 {

	public abstract  void Hello() ;
	
}


class By_using_abstract_class extends interfaceB1
{
	
	public static void main(String args[])
	{
		interfaceB1 A1= new By_using_abstract_class();
		A1.Hello();
		
		
	}
	

	public  void Hello()
	{
		System.out.println("Hai");
		
	}
	
}




