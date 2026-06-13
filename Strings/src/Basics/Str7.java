package Basics;

public class Str7 {
public static void main(String[] args) {
		
		
		String s = "My name is RAJU and my PhNo is 9876543210 and Password is: Chutki@$%&" ;
		
		int digitCt = 0, upperCt=0,lowerCt=0,splCt=0 ;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if (ch>='a'&&ch<='z') {
				
				lowerCt++ ;
			}
			else if (ch>='A'&&ch<='Z') {
				
				upperCt++ ;
			}
			else if (ch>='0'&&ch<='9') {
				digitCt++ ;
			}
			else
			{
				splCt++ ;
			}
		}
		
		System.out.println(upperCt);
		System.out.println(lowerCt);
		System.out.println(digitCt);
		System.out.println(splCt);
	}

}
