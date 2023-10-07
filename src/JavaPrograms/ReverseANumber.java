package JavaPrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : " );
		int num= sc.nextInt();  //1234
		
   /*    //1.using algorithm
		
		int rev=0;
		
		while ( num != 0)
			
		{
			rev = rev*10 + num%10;   //  0 +1234%10 = 4  
		  num= num/10;             // 1234/10=123                
		}
		
		System.out.println("Reverse Number is : " + rev); */
		
		
		// 2.Using String buffer class
		
		StringBuffer sb= new StringBuffer(String.valueOf(num));
	
		System.out.println(sb.reverse());
		//or
		//StringBuffer rev =   sb.reverse();
		//System.out.println(rev);
		
	}

}
