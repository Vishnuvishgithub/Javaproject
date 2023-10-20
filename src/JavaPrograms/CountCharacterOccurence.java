package JavaPrograms;

public class CountCharacterOccurence {

	public static void main(String[] args) {
	
		        String s = "Java Programming Java Oops";

		        int totalcount = s.length();// total length of a string

		        int totalcountafterreplace = s.replace("a", "").length();

		        int count = totalcount - totalcountafterreplace;

		        System.out.println("Total count after removing " + count);
		    }
		}
	
	
	