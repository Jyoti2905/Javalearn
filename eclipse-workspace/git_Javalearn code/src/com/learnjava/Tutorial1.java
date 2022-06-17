package com.learnjava;

import java.util.Scanner;

public class Tutorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=153;
int rem;
int rev=0; int result=0;
int b=a;
while(b!=0)
	{
		rem=b%10;
		result=(int) (result+ Math.pow(rem, 3));
		b=b/10;
			}
if(a==result) {
	System.out.println("Its an armstrong num");
}
else {
	System.out.println("Its not an armstrong num");
}

Scanner input=new Scanner(System.in);
System.out.println("enter an number");
int a1=input.nextInt();

if(a1<0) {
	System.out.println("its negative");
}
else {
	System.out.println("its postive num");
	
}

for(int i=1;i<=10;i++) {
	System.out.printf("%d * %d= %d \n", a1,i,a1*i);
}
	}

}
