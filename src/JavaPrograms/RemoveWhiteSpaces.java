package JavaPrograms;

public class RemoveWhiteSpaces {

   public static void main(String[] args) {
	
	   String str = "Java   Programming    Selenium      Automation ";
	   
	   // using replaceall method 
	   
	   str=  str.replaceAll("\\s", "");
	   
	   System.out.println("After removing the white spaces :" + str);


	}

}
