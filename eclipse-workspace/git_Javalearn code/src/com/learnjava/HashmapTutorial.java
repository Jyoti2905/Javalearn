package com.learnjava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashmapTutorial {
	public static void main(String[] args) {
		Map<String,Integer> hashtest=new HashMap<>();
		hashtest.put("India", 1);
		hashtest.put("US", 1);
		hashtest.put("UK", 1);
		hashtest.put("Canada", 1);
		
		System.out.println(hashtest.keySet());
		System.out.println(hashtest.values());
		System.out.println(hashtest.entrySet());
		
		//Streams and lambda expression
		List<String> lst=Arrays.asList("USA, Newyork","India,Delhi","Nepal,kz","Nepal,Lz");
		
		lst.stream().map((s)->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
	//	lst.stream().filter((s)->s.startsWith("Nepal")).map((s)->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
	}
}
