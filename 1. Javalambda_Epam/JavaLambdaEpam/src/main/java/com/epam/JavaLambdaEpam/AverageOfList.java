package com.epam.JavaLambdaEpam;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class AverageOfList
{
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(70);
		Double d=arrayList.stream().mapToDouble(a -> a).average().getAsDouble();
		System.out.println("Average of array is " + d);
	}
}
