package Basics;

public class Str3 {
public static void main(String[] args) {
		
		
		String s1 = "Deccan" ;
		System.out.println(s1.hashCode());
		String s2 = "Pune" ;
		
		System.out.println(s2.hashCode());
		String s3 = s1 + s2 ;
		
		System.out.println(s3);
		System.out.println(s3.hashCode());
	}
}
