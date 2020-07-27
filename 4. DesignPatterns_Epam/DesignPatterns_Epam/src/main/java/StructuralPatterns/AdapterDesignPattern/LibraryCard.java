package StructuralPatterns.AdapterDesignPattern;

import java.io.IOException;

public interface LibraryCard {
	public void giveLibraryDetails() throws IOException;
	public String getLibraryCard();
}