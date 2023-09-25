package Project;

//An iterator in Java is an object that can be used to loop through collections, 
//such as ArrayList and HashSet. It is called an “iterator” because “iterating” is the technical term for looping. 
//To use an iterator, you must import it from the java.util package1.


	
	
	// Import the ArrayList class and the Iterator class
	import java.util.ArrayList;
	import java.util.Iterator;

	public class Arraylistpgm {
	  public static void main(String[] args) {
	    // Make a collection
	    ArrayList<String> cars = new ArrayList<>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");

	    // Get the iterator
	    Iterator<String> it = cars.iterator();

	    // Loop through the collection
	    while (it.hasNext())  // returns true if the iteration has more elements
	    {
	      // Print the current element
	      System.out.println(it.next());
	    }
	  }
	}


	


