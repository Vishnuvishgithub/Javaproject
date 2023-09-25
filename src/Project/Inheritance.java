package Project;

		class Animal 
		{
		 
		  public void sound()
		  {
		    System.out.println("Animal makes a sound");
		  }
		}

		// A class named Dog that inherits from Animal
		class Dog extends Animal 
		{
		  // A method named bark that overrides the sound method
		  public void bark() 
		  {
		    System.out.println("Dog barks");
		  }
		}

		// A class named Main to test the inheritance
		public class Inheritance{
		  public static void main(String[] args) {
		    // Create an object of Dog class
		    Dog dog = new Dog();
		    // Call the sound method inherited from Animal class
		    dog.sound();
		    // Call the bark method defined in Dog class
		    dog.bark();
		  }
		}

