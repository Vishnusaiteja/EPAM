package com.klu.DesignPatterns.BehaviouralPatterns.FactoryDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryDesignPatternDemo{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Cable Plan type:");
		String cableName=br.readLine();
		System.out.println("Enter the number of days:");
		int days=Integer.parseInt(br.readLine());
		SelectCableFactory selectCable=new SelectCableFactory();
		Object obj=(CablePlan)selectCable.getPlan(cableName);
		System.out.print("Bill amount for "+cableName+" is:");
		((CablePlan) obj).getRate();
		((CablePlan) obj).processBill(days);
	}
}
