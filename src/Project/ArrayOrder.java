package Project;

public class ArrayOrder {

	public static void main(String[] args) {
		
		        int[] arr = {1, 2, 3, 4, 5};
		        
		        System.out.println("Elements of the array in forward order:");
		        for (int i = 0; i < arr.length; i++) 
		        {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println();
		        
		        System.out.println("Elements of the array in backward order:");
		        for (int i = arr.length - 1; i >= 0; i--)
		        {
		            System.out.print(arr[i] + " ");
		        }
		    }
		}

	
	
	
	
	
	
