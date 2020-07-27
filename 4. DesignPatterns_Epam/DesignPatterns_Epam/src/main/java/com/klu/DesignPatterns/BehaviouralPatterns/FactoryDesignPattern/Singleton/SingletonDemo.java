package com.klu.DesignPatterns.BehaviouralPatterns.FactoryDesignPattern.Singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SingletonDemo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int choice;
		SingletonObject singletonObject=SingletonObject.getSingletonObject();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 do{   
		        System.out.println("LIST OPERATIONS");  
		        System.out.println(" --------------------- ");  
		        System.out.println(" 1. Insertion ");  
		        System.out.println(" 2. View      ");  
		        System.out.println(" 3. Delete    "); 
		        System.out.println(" 4. Exit      ");  
		        
		        System.out.print("\n");  
		        System.out.print("Please enter the choice what you want to perform in the database: ");  
		        
		        choice=Integer.parseInt(br.readLine());
		        switch(choice) {
		        	case 1:{
		        		System.out.print("Enter the element to insert:");
		        		int element=Integer.parseInt(br.readLine());
		        		singletonObject.insert(element);
		        	}
		        	break;
		        	case 2:{
		        		singletonObject.view();
		        	}
		        	break;
		        	case 3:{
		        		System.out.print("Enter the position to delete:");
		        		int pos=Integer.parseInt(br.readLine());
		        		singletonObject.delete(pos);
		        	}
		        	break;
		        }
		 }while(choice!=4);
	}
}
