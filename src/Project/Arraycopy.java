package Project;

public class Arraycopy {

		
	 public static void main(String[] args) {
		     
		        int[] arr1 = {1, 2, 3, 4, 5}; // first array declaration

		      
		        int[] arr2= new int[arr1.length]; // Second array declaration 

		        // Copy one array into another array 
		        for (int i = 0; i < arr1.length; i++)
		        {
		            arr2[i] =arr1[i];
		        }

		        // First array
		        System.out.print("Elements of the First array: ");
		        for (int i = 0; i < arr1.length; i++) 
		        {
		            System.out.print(arr1[i] + " , ");
		        }
		        System.out.println();

		        //  second array
		        System.out.print("Elements of the Second array: ");
		        for (int i = 0; i < arr2.length; i++)
		        {
		            System.out.print(arr2[i] + " , ");
		        }
		   
		
		}

}
