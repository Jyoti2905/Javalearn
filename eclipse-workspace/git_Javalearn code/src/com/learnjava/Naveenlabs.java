package com.learnjava;

import java.util.Scanner;

public class Naveenlabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a;
 Scanner input=new Scanner(System.in);
 System.out.println("enter an int:");
a= input.nextInt();
System.out.println("integer entered is "+a);

int a1,b,c;
a1=20;
b=30;
c=a1+b;
System.out.println(c);

Float f1= (float) 2.1;
Float f2= (float) 2.1;
float f3;
f3=f1*f2;

System.out.println(+f3);

char c1='A';
int asc=c1;
System.out.println("\n ascii of A is "+asc);

int num=123; int i=2;
int rem= num%i;
int quo=num/i;

System.out.println("\n quotient of"+num+ ":" +quo+ " remainder is :" +rem);

int a2=2;
int b2 =3;
int c2;
c2=a2;
a2=b2;b2=c2;

System.out.println("\n a is" +a2+ "\n b is" +b2);

a2=a2-b2;
b2=a2+b2;
a2=b2-a2;

System.out.println("\n a is" +a2+ "\n b is" +b2);

//num is even or odd
int od=11;
if(od%2==0) {
	System.out.println("num is even");
}
else {
	System.out.println("num is odd");
}
	}

}
