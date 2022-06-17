package com.learnjava;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//move all 0 at the last of array
		int a[]= {1,0,2,0,3,3,0};
		String r1="",r2="";
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0){
				r1=r1+a[i];
			}
			else {
				r2=r2+a[i];
			}
		}
		String r3=r1+r2;
		int i1=Integer.parseInt(r3);
				System.out.println(i1);
				System.out.println("test");
	}

}
