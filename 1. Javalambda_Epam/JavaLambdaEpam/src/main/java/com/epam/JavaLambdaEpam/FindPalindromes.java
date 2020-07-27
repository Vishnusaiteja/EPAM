package com.epam.JavaLambdaEpam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindPalindromes {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("aaaaa");
		arrayList.add("abcd");
		arrayList.add("abcdeffedcba");
		arrayList.add("aaazzz");
		arrayList.add("abcba");
		arrayList.add("abba");
		List<String> result=(ArrayList<String>) arrayList.stream().filter(ele->ele.equals(((new StringBuffer(ele)).reverse()).toString() ) ).collect(Collectors.toList());
		System.out.println("The list containing palindromes:"+result);

	}
}
