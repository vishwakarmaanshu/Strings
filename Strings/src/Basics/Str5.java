package Basics;

public class Str5 {
public static void main(String[] args) {
		
		String s = "Qspiders" ;
		
		char ans [] = stringtoCharArray(s) ;
		
		for (int i = 0; i < ans.length; i++) {
			
			System.out.println(ans[i]);
		}
		
		
		System.out.println(Arrays.toString(charsToAscii(s)));
		
	}
	
	public static char[] stringtoCharArray(String s)
	{
		char[]ch = new char[s.length()] ;
		
		for (int i = 0; i < s.length(); i++) {
			
			ch[i] = s.charAt(i) ;
		}
		
		return ch ;
	}
	
	public static int[] charsToAscii(String s)
	{
		int [] ar = new int[s.length()] ;
		
		for (int i = 0; i < s.length(); i++) {
			
			ar[i] = s.charAt(i) ;
		}
		
		return ar ;
	}

}
