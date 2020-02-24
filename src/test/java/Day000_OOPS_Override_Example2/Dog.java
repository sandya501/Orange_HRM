package  Day000_OOPS_Override_Example2;

//https://beginnersbook.com/2013/04/oops-concepts/#8

/*
 
Method Overriding concept
Dynamic Polymorphism
It is also known as Dynamic Method Dispatch. Dynamic polymorphism is a process in 
which a call to an overridden method is resolved at runtime rather, 
thats why it is called runtime polymorphism.*/


class Animal12
{
	
	   public void animalSound()
	   {
		System.out.println("Default Sound");
	   }
	   
}


public class Dog extends Animal12
{  
	
	   public void animalSound()
	   {
		System.out.println("Woof");
	   } 
	   
	   public static void main(String args[])
	   {
			Animal12 T1 = new Dog();
			T1.animalSound();
	   }
		
}