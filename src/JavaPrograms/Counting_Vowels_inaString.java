package JavaPrograms;

public class Counting_Vowels_inaString {

	public static void main(String[] args) {
		
		// output 5
		
				String str= "learningjava";
				String vowels= "aeiou";
				int count =0;
				
				for(int i =0;i<str.length();i++)
				{
					if (vowels.indexOf(str.charAt(i)) != -1) // using indexof funtion
					{
						count++;
					}
				}
				
				System.out.println("Total vowels in the string :" + count);
				
				System.out.println("Total number of consonants :" +(str.length()-count));
			
		
		
	}

}
