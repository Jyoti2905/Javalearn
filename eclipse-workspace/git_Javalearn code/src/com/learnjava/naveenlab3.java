package com.learnjava;

import java.util.Scanner;

public class naveenlab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int year=2021;

 
 if((year%400==0)||((year %4==0)&&(year%100!=0))) {
	 System.out.println("its leap year");
 }
 else {
	 System.out.println("Not a leap year");
 }
 
 Scanner in=new Scanner(System.in);
 System.out.println("enter a num");
 int a=in.nextInt();
 
 if(a<0) {
	 System.out.println("its negative num");
 }
 else {
	 System.out.println("its poistive num");
 }
 
char s='9';
if((s>='a' & s<='z')||(s>='A'& s<='Z')){
	System.out.println("its a char");
}
else {
	System.out.println("Not a char");
}

for(int i=1;i<=10;i++) {
	int b=a*i;
	System.out.println(+a+"*"+i+"="+b);
}

int asc1=65;
for(int i=1;i<27;i++) {
	
char c1=(char) asc1;
System.out.print(c1);
asc1=asc1+1;
	}
int t=121;int rem1;int rev=0;int d=t;int temp=0;
while(t>0) {
	rem1=t%10;
	rev=rev*10+rem1;
	t=t/10;
}
System.out.println("\n reverse of int: "+d+ " is :" +rev);
if(d==rev) {
	System.out.println("palindrome");
}
else {
	System.out.println("not palindrome");
}

for(int i=2;i<t/2;i++) {
	if(t%i==0) {
		temp=temp++;
	}
}
if(temp==0) {
	System.out.println("prime num");
}
else {
	System.out.println("not prime");
}

//sum of natural number from 1 to 100
int num11=100;int sum=0;
for(int i=0;i<=num11;i++) {
	sum=sum+i;
}
System.out.println(sum);

int fact=5;int temp2=fact;
for(int i=fact-1;i>0;i--) {
	temp2=temp2*i;
}
System.out.println("\n factorial of 5 is "+temp2);

//fibonicce series
int no=10;int i1=0,i2=1;
for(int i=0;i<=no;i++) {
	System.out.println(i1);
	int i3= i1+i2;
	i1=i2;
	i2=i3;
}

int numb=123456,count=0;
while(numb!=0) {
	numb=numb/10;
	count=count+1;
}
System.out.println("number of digit in given num is: " +count);


//Power of a num
int po=3,expo=4,temp33=1;
for(int i=0;i<expo;i++) {
	temp33=temp33*po;
}
System.out.println(temp33);
	}

}
