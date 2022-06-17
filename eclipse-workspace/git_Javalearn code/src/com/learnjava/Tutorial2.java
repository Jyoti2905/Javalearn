package com.learnjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tutorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="madaf";
		
		StringBuilder sb=new StringBuilder(str);
	String str1=sb.reverse().toString();
	if(str.equals(str1)) {
		System.out.println("its palendrome");
	}
	else {
		System.out.println("its not palindrome");
	}
	
	
		//check whether given char is alpahbet
		 char C='d';
		 if((C>'a' && C< 'z') ||(C>'A' && C<'Z')) {
			 System.out.println("its an alphabet");
		 }
		 else {
			 System.out.println("Its not alphabet");
		 }
	
		 //count oif a char in a string
		 String a="Jyotitesting"; int temp=0;
		 for(int i=0;i<a.length();i++) {
			 if(a.charAt(i)=='t') {
				 temp=temp+1;
			 }
			 
		 }
		 System.out.println("count of t in the string is: " +temp);
		 
		 List<String> L1= Arrays.asList("test","testing","tester");
		 System.out.println(L1);
		 
		 ArrayList<String> animals = new ArrayList<>();
	        // Add elements
	        animals.add("Dog");
	        animals.add("Cat");
	        animals.add("Horse");

	        System.out.println("ArrayList: " + animals);
	        
	        List<String> l3=new ArrayList<>();
	        l3.addAll(L1);
	        System.out.println(l3);
	}

}
