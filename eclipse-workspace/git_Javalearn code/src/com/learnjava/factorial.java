package com.learnjava;

public class factorial {

	
	public static int factor(int fact) {
	 if(fact!=0) {
		return fact* factor(fact-1);
	 }
	 else {
		 return 1;
	 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int abc=factor(5);
 System.out.println(abc);
	}

}
