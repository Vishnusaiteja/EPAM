package StructuralPatterns.AdapterDesignPattern;

import java.io.IOException;

public class AdapterDesignPatternDemo {

	public static void main(String[] args) throws IOException {
		LibraryCard targetInterface=new BookHolder();
		targetInterface.giveLibraryDetails();
		System.out.println(targetInterface.getLibraryCard());
	}

}