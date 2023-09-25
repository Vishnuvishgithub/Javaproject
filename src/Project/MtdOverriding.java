package Project;



// Method overriding is a  Feature in Java that allows if a  child class 
//is not satisfied with the implementation done by the parent class it can override the method 
// The child class can modify the behavior of the method inherited from the parent class 

		// A Parent class named Animal
		class Animal
		{
		  // A method named sound
		  public void sound() 
		  {
		    System.out.println("Animal makes a sound");
		  }
		}

		// A class named Dog that inherits from Animal
		class Dog extends Animal 
		{
		  // A method named sound that overrides the sound method of Animal class
		  public void sound() 
		  {
		    System.out.println("Dog barks");
		  }
		}

		
		class MtdOverriding {
		  public static void main(String[] args) {
		   
			  // Create an object of Animal class
		    Animal animal = new Animal();
		    // Call the sound method of Animal class
		    animal.sound();
		    // Create an object of Dog class
		    Dog dog = new Dog();
		    // Call the sound method of Dog class
		    dog.sound();
		  }
		}
	
		
		
		
		
		
	