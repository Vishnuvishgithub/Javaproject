package Project;

//A HashSet is a collection class in Java that implements the Set interface and stores unique elements 
// NOT ALLOW DUPLICATE ELEMENTS AND IT IS UNORDERED



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

		  
		    System.out.println(set);

		    System.out.println(set.contains("Yellow"));
         set.remove("Green");
		    System.out.println(set);
		// usind iterator
		  Iterator itr=set.iterator();
		  while (itr.hasNext()) 
		  {
		   System.out.println( itr.next());
			
		}
		  // using foreach
		  
		  for (String a : set)
		  {
			System.out.println(a);
		}
		  
		  
		  
		  }
		}

		
		
		
		
	
