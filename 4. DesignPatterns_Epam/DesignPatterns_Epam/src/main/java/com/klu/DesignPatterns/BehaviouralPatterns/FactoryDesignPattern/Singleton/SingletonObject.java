package com.klu.DesignPatterns.BehaviouralPatterns.FactoryDesignPattern.Singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonObject {
	private static SingletonObject singletonObject;
	private SingletonObject() {}

	List<Integer> list=new ArrayList<Integer>();
	public static SingletonObject getSingletonObject() {
		if(singletonObject==null)
			return new SingletonObject();
		return singletonObject;
	}

	public void insert(int element) {
		list.add(element);
	}

	public void view() {
		for(int listElement:list) {
			System.out.println(listElement);
		}
	}

	public void delete(int pos) {
		list.remove(pos);
	}
	
}