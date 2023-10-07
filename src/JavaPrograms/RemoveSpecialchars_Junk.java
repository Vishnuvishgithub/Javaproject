package JavaPrograms;

public class RemoveSpecialchars_Junk {

	public static void main(String[] args) {
		
		String s =" @#$$%^&# latin string  1234567" ;
		
		String s1="%$#&@!   testing   !@#$&*  Selenium !@#$%##  &&&   Java";
		
	    s=	s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
		
        
        s1=s1.replaceAll("[^a-zA-Z0-9]", "");
        
        System.out.println(s1);
        
		
	}

}
