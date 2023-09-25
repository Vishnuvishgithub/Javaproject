package Project;

// Abstraction is the process of hiding the implementation details and show only the functionality 
// 1.The class declared with the abstract keyword 
// 2.In an abstract class you have abstract method, non abstract method and also constructor
// It cannot be initiated 




import java.util.*;

abstract class sample
{
	sample()
	{
		System.out.println(" This s a constructor");
	}

   void run()
   {
	   System.out.println(" non abstract methods");
   }


 abstract void change();

}

class sample1 extends sample  
{
	void change()
	{
	   int a = 90;
	   int c = a*a;
	   System.out.println(c);
	}
}

public class AbstractClass extends sample {
	
	void change()
	{
		int b= 70,c= 10,d;
		d=b/c;
		System.out.println(d);
	}
	

	public static void main(String[] args) {
		
		sample obj = new sample1();
         obj.run();
	     obj.change();
	 
	     sample obj1=new AbstractClass();
	     obj1.change();
	
	
	
	
	}

}
