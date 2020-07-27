package com.klu.DesignPatterns.BehaviouralPatterns.FactoryDesignPattern;

public abstract class CablePlan {
	protected double rate;
	abstract void getRate();
	public void processBill(int days) {
		System.out.println(rate*days);
	}
}
