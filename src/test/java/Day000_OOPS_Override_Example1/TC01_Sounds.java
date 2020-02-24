package Day000_OOPS_Override_Example1;
/*
https://beginnersbook.com/2013/04/oops-concepts/#8
Polymorphism:
Polymorphism is a object oriented programming feature that allows 
us to perform a single action in different ways. For example, lets 
say we have a class Animal that has a method animalSound(), 
here we cannot give implementation to this method as we do not know which Animal 
class would extend Animal class. So, we make this method abstract like this:
	*/

public  class TC01_Sounds  {
	
	 public static void main(String args[])
	   {
	       Animal D1= new Dog();
	       Animal L1= new Lion();
	       
	       D1.animalSound();
	       L1.animalSound();
	   }

}
