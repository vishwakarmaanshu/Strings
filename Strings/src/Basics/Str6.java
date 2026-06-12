package Basics;

public class Str6 {
public static void main(String[] args) {
		
		String s = "malayalam" ;
		
		String rev = "" ;
		
		for (int i = s.length()-1; i>=0; i--) {
			
			rev = rev + s.charAt(i);
		}
		
		if (s.equals(rev)) {
			
			System.out.println("It is a palindrome String");
		}
		else
		{
			System.out.println("It is not a palindrome string");
		}
	}

}
