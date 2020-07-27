package StructuralPatterns.FacadeDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeDesignPatternDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int choice;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1.KFC       ");
			System.out.println("2.Mc Donalds");
			System.out.println("3.Exit      ");
			
			System.out.println();
			System.out.print("Enter your Choice:");
			choice=Integer.parseInt(br.readLine());
			FranchiseReg franchiseReg=new FranchiseReg();
			switch(choice) {
				case 1:{
					franchiseReg.buyKFCFranchise();
				}
				break;
				case 2:{
					franchiseReg.buyMcDonalds();
				}
				break;
			}
		}while(choice!=3);
	}

}
