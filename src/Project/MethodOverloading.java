package Project;

//method overloading is the feature in Java which allows the class to have more than one methods with the same name  but with different parameters 
	
		// A class named Calculator
		class Calculator 
		{
		  // A method named add that takes two int parameters and returns their sum
		  public int add(int a, int b) 
		  {
		    return a + b;
		  }
		  
		  // A method named add that takes three int parameters and returns their sum
		  public int add(int a, int b, int c)
		  {
		    return a + b + c;
		  }
		  
		  // A method named add that takes two double parameters and returns their sum
		  public double add(double a, double b)
		  {
		    return a + b;
		  }
		}

		// A class named Main to test the method overloading
		class MethodOverloading {
		  public static void main(String[] args) {
		    // Create an object of Calculator class
		    Calculator calc = new Calculator();
		    // Call the add method with two int arguments
		    System.out.println(calc.add(10, 20));
		    // Call the add method with three int arguments
		    System.out.println(calc.add(10, 20, 30));
		    // Call the add method with two double arguments
		    System.out.println(calc.add(10.5, 20.5));
		  }
		

	
	
	
	}


