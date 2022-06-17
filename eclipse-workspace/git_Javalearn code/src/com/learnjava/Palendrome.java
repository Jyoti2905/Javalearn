package com.learnjava;

import java.util.Arrays;

public class Palendrome {

	public static void main(String[] args)  {
	
		String str11="test";
	byte[] bytes=	str11.getBytes();
	System.out.println(Arrays.toString(bytes));
	
		String s11="Testing";
//use functional interface method		
		MyInterface mref=(s)->{
			String rev="";
			for(int i=s.length()-1;i>=0;i--)
				rev=rev+s.charAt(i);
			return rev;
		};
		System.out.println(mref.revString(s11));
		
	//palendrome of int	
		int a=123;
		//int temp = a;
		int rev=0;
		int rem;
		while (a>0) {
			rem=a%10; 
			 rev=rev*10+rem; 
			a=a/10; 
		}
		System.out.println(rev);
		if(a==rev) {
			System.out.println("palindrome");
		}
				else {
			System.out.println("not palindrome");
		}
		
		
		// palendrome of string
		String normstr="madal";
		StringBuilder sb = new StringBuilder(normstr);
		String revStr = sb. reverse(). toString();
		System.out.println("\nThe result of String Reverse = " + revStr);
		if(normstr.equalsIgnoreCase(revStr) == true) {
		System.out.println("\nThe Given String " + normstr + " is a Palindrome");}
		else {
			System.out.println("\nThe Given String " + normstr + " is not a Palindrome");
	}
		
		
	}
}
