package Project;

//The switch statement is a control flow statement that allows us to choose among multiple alternatives. 
//The syntax of the switch statement in Java is:


/*switch (expression)
{
case value1:
  // code block 1
  break;
case value2:
  // code block 2
  break;
...
default:
  // default code block
}*/



public class SwitchPgm {
		 
	public static void main(String[] args) {
		    char ch = 'a'; // input character
		    String result; // output string
		    switch (ch) {
		      case 'a':
		      case 'e':
		      case 'i':
		      case 'o':
		      case 'u':
		        result = "vowel"; // if ch is any of these, assign "vowel" to result
		        break;
		      default:
		        result = "consonant"; // otherwise, assign "consonant" to result
		    }
		    System.out.println(ch + " is a " + result); // print the output
		  }
		}


