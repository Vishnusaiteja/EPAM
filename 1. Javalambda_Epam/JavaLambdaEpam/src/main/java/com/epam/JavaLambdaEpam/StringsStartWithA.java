package com.epam.JavaLambdaEpam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringsStartWithA {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("abc");
		arrayList.add("abcde");
		arrayList.add("azf");
		arrayList.add("aimnf");
		arrayList.add("apple");
		arrayList.add("aaa");
		List<String> result=(ArrayList<String>) arrayList.stream().filter(ele-> ele.charAt(0)=='a' && ele.length()==3).collect(Collectors.toList());
		System.out.println("The list containing strings of length 3 and starting with a:"+result);
		
	}
}
