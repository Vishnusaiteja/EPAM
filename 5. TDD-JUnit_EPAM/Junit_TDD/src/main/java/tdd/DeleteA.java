package tdd;
//import java.util.Scanner;
public class DeleteA {

		public String remove(String string) {
			String string1="";
			if(string.charAt(0)!='A')
				string1=string1+string.charAt(0);
			if(string.charAt(1)!='A')
				string1=string1+string.charAt(1);
			string1=string1+string.substring(2);
			return string1;
		}

}
