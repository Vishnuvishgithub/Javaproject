package Project;

//A HashSet is a collection class in Java that implements the Set interface and stores unique elements 
//in an unordered way. It uses a hash table internally to store the elements, 



// Import the HashSet class
		import java.util.*;

		public class Hashsetpgm {
		  public static void main(String[] args) {
		    // Create a HashSet object called set
		    HashSet<String> set = new HashSet<>();

		    // Add some elements to the set
		    set.add("Red");
		    set.add("Green");
		    set.add("Blue");

		    // Print the set
		    System.out.println(set);

		    // Check if an element exists in the set
		    System.out.println(set.contains("Yellow"));

		    // Remove an element from the set
		    set.remove("Green");

		    // Print the set again
		    System.out.println(set);
		  }
		}

		
		
		
		
	
