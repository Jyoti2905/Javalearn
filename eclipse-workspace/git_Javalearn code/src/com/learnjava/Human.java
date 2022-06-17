package com.learnjava;

import java.util.Scanner;

public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Boy b=new Boy();
b.boyfood();


//int a=60;
Scanner input=new Scanner(System.in) ;
System.out.println("enter a num");
int a=input.nextInt();
int temp = 0;
for(int i=2;i<a/2;i++) {
	if(a%i==0) {
		temp=temp+1;
	}
}
	if(temp<1) {
		System.out.println("its a prime num");
	}
	else {
		System.out.println("Not a prime num");
	}
	
	String abc="testing";
	String rev="";
	for(int i=abc.length()-1;i>=0;i--) {
		rev=rev+abc.charAt(i);
	}
	System.out.println("rev is: " +rev);
}

	
	
	}


