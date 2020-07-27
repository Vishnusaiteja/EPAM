package com.klu.DesignPatterns.BehaviouralPatterns.FactoryDesignPattern;

public class SelectCableFactory {
	public CablePlan getPlan(String planType) {
		if(planType==null)
			return null;
		if(planType.equalsIgnoreCase("ABC_Cable")) {
			return new ABC_Cable();
		}
		else if(planType.equalsIgnoreCase("PQR_Cable")) {
			return new PQR_Cable();
		}
		return null;
	}
}
