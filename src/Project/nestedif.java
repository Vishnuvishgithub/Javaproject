
package Project;

public class nestedif {

	public static void main(String[] args) {
	
		    int number = 0;
		    // Check if number is positive, negative, or zero using the relational operators (<, >, ==)
		    if (number > 0) 
		    {
		    
		      System.out.println(number + " is positive");
		      // Check if number is divisible by 2 using the modulo operator (%)
		      if (number % 2 == 0) 
		      {
		      
		        System.out.println(number + " is even");
		      }
		      else 
		      {
		        
		        System.out.println(number + " is odd");
		      }
		    } 
		    else if (number < 0) 
		    {
		    
		      System.out.println(number + " is negative");
		      
		      if (number % 3 == 0) 
		      {
		      
		        System.out.println(number + " is divisible by 3");
		      } 
		      else 
		      {
		       
		        System.out.println(number + " is not divisible by 3");
		      }
		    } 
		    else 
		    {
		      
		      System.out.println(number + " is zero");
		    }
		  }
		

	
	
	}


