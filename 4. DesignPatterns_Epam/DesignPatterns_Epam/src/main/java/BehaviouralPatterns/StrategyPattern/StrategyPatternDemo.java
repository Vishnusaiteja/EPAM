package BehaviouralPatterns.StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyPatternDemo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the first number:");
		float a=Float.parseFloat(br.readLine());
		System.out.print("Enter the second number:");
		float b=Float.parseFloat(br.readLine());
		Add add=new Add();
		System.out.println("Addition of two numbers:"+add.calculation(a, b));
		Sub sub=new Sub();
		System.out.println("Subtraction of two numbers:"+sub.calculation(a, b));
		Mul mul=new Mul();
		System.out.println("Multiplication of two numbers:"+mul.calculation(a, b));
		Div div=new Div();
		System.out.println("Division of two numbers:"+div.calculation(a, b));
	}
}
