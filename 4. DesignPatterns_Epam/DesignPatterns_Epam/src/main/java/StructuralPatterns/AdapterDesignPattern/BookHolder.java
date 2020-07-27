package StructuralPatterns.AdapterDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookHolder extends LibraryDetails implements LibraryCard {
	String readerName,libraryName;
	long accountNumber;
	public void giveLibraryDetails() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Library account holder name:");
		readerName=br.readLine();
		System.out.println();
		System.out.print("Enter the account number of the library:");
		accountNumber = Long.parseLong(br.readLine());
		System.out.println();
		System.out.print("Enter the Library name:");
		libraryName=br.readLine();
		System.out.println();
		
	}

	public String getLibraryCard() {
		return "Account number +"+(Long.toString(accountNumber))+" of "+libraryName+" of library "+libraryName+" is approved";
	}
	
}
