package com.learnjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> int1=new ArrayList<>();
		int1.add(23);
		int1.add(34);
		
		int1.set(1, 24); // you can change the value of index 1 to another value from 34 its changed to 24
		System.out.println("arraylist: " +int1);
		
		List<String> str1=Arrays.asList("Java","exam","Prep","interview");
		List<Integer> int2=Arrays.asList(1,2,3,4,5,6);
		
		System.out.println(str1.get(3));
		System.out.println(int2.set(1, 0));
		System.out.println(int2.get(1));
		
		
		//convert an array to arraylist
		String[] arr= {"test","array","convert","arraylist"};
		int[] arri= {2,3,4,5};
		for(String i:arr) {
		System.out.println(i);
		}
		List<String> arrlist=new ArrayList<>(Arrays.asList(arr));
		System.out.println(arrlist);
		
		//Convert arraylist to array
		
		List<String> arrlist1=Arrays.asList("convert","this","arraylist","to","array");
		String[] strarr=new String[arrlist1.size()];
		 arrlist1.toArray(strarr);
				 for(String s:strarr) {
			 System.out.printf("," +s);
		 }
	}

}
