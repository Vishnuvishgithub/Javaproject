package Project;

import java.util.Scanner;

public class Counting_Consonants_Array {

	public static void main(String[] args) {
		// To find out the consonants in the string
		
		int count = 0;
	
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		for (int i = 0;i<name.length();i++)
			
		{
			char ch = name.charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  )
			{
				System.out.println("");
			}
			else if (ch !=' ' )
			{
				count++;
			}
			
		}
		
		System.out.println("No of consonants in the given string is :" + count);
	

	}

}
