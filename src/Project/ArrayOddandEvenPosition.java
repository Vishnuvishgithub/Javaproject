package Project;
import java.util.*;

public class ArrayOddandEvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		        
		        System.out.println("Elements of the array present at odd positions:");
		        for (int i = 0; i < arr.length; i= i+ 2) 
		        {
		            System.out.print(arr[i] + " ");
		        }
		        
		        System.out.println("\nElements of the array present at even positions:");
		        for (int i = 1; i < arr.length; i = i+ 2) 
		        {
		            System.out.print(arr[i] + " ");
		        }
		    }
		

		
	}
