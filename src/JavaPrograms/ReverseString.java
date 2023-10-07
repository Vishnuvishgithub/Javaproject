package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		// 1.using + concatenation operator 
		
		String str= "ABCD";
		String rev = "";
		
	/*	int len= str.length();        //     4

	 for (int i = len-1; i >=0;i-- )    //3
	 {
		 rev= rev+ str.charAt(i);      //D C B A 
	 }
		
		System.out.println("Reversed String is : " +rev); */
		
		// 2.Using Chracter array 
		
	/*	char a [] = str.toCharArray();    // convert string into character array
		
		int leng = a.length;  // 4
		
		for (int i = leng-1;i>=0;i--) 
		{
			rev=rev+a[i];
		}
		
		System.out.println("Reversed String is : " +rev);  */
		
		
		//3.Using String Buffer class
		
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		System.out.println("Reversed String is : " + sb);
		
		
		
		
		
		
		
	}

}
