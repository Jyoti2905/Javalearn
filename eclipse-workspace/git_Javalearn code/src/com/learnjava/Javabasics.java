package com.learnjava;

public class Javabasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//converting staring to char array
		String abc="Testing";
	char[] Char=	abc.toCharArray();
	System.out.println(Char);
System.out.println(abc.charAt(2));


// converting char to string
char c='A';
String s= "" +c;
String s1 = Character.toString(c);
System.out.println(s);
System.out.println(s1);

//move all special chars from string at the end

String spchar="Testing@Javabasic%learn:test";
String s2="",s3="",s5="",rev="";
for(int i=0;i<spchar.length();i++) {
		char ch= spchar.charAt(i);
	if(Character.isLetterOrDigit(ch)|| ch==' ') {
		s2=s2+ch;
	}
	else {
		s3=s3+ch;
	}
	if(Character.isUpperCase(ch)) {
		s5=s5+ch;
	}
	}
String s4= s2+s3;
System.out.println(s4);
System.out.println(s5+" are the only uppercase letters found");
for(int i=spchar.length()-1;i>=0;i--) {
	char ch=spchar.charAt(i);
	rev=rev+ch;
}
 System.out.println(rev);
	}
 
}
