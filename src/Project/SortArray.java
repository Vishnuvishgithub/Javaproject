package Project;

import java.util.*;

public class SortArray {

	public static void main(String[] args) {
	


		        int[] arr = {5, 2, 8, 7, 1};
		        
		        System.out.println("Elements of the original array:");
		        for (int i = 0; i < arr.length; i++)
		        {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println();
		        Arrays.sort(arr);  // sort method
		        
		        System.out.println("Elements of the array sorted in ascending order:");
		        for (int i = 0; i < arr.length; i++) 
		        {
		            System.out.print(arr[i] + " ");
		        }
		     
	
	}
		}

	
	


