package com.learnjava;

public class navenlab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='i';
		
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("its a vowel");
			break;
			
			default: 
				System.out.println("not a vowel");
		}
		
	/*	
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("its a vowel");
		}
		else {
			System.out.println("Not a vowel");
		}
		*/
		
int i1=167;
int i2=99;
int i3=109;

if(i1>i2 && i1>i3) {
	System.out.println("greater num is " +i1);
}
else if(i1<i2 && i2<i3){
	System.out.println("greater num is " +i3);
}
else {
	System.out.println("greater is"+i2);
}
	}

}
