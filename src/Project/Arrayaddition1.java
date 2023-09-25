package Project;

public class Arrayaddition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};   // 2*3 matrix
		int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};

		
		int[][] addition = new int[2][3];
		
		for (int i = 0; i < 2; i++) //for rows
		{ 
			  for (int j = 0; j < 3; j++) //for columns
			  { 
			    addition[i][j] = matrix1[i][j] + matrix2[i][j]; // add and store
			  }
		System.out.println("addition :" + addition + " ");	
		}


		
	}

}
