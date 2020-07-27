package giftstore;
import java.util.*;
public class GiftAnalysis {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] arg)
		{
			Rasgulla r=new Rasgulla();
			double TotalWeight=0;
			double TotalPrice=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter type of gift 1.Candy 2.Sweet");
			int op=sc.nextInt();
			if(op==2)
			{
				System.out.println("Enter 1)numberofRasgullas  2)weightofEachRasgulla 3) price of rasgulla");
				int NoOfSweets=sc.nextInt();
				double weight=sc.nextDouble();
				double price=sc.nextDouble();
				r.SetData1(NoOfSweets,92.36,price);
				r.SetData2(weight,"Sweet");
				r.GetInfo();
				TotalWeight+=weight*NoOfSweets;
				TotalPrice+=price*NoOfSweets;
			//	System.out.println("Total weights :"+TotalWeight+" Total Price"+TotalPrice);
				GulabJamun g=new GulabJamun();
				System.out.println("Enter 1)numberofGulabJamun  2)weightofEachGulabJamun 3) PriceOfGulabJamun");
				 NoOfSweets=sc.nextInt();
				 weight=sc.nextDouble();
				 price=sc.nextDouble();
				g.SetData1(NoOfSweets,33.36,price);
				g.SetData2(weight,"Sweet");
				g.GetInfo();
				TotalWeight+=weight*NoOfSweets;
				TotalPrice+=price*NoOfSweets;
				Kova k=new Kova();
				System.out.println("Enter 1)NumberOfKovass  2)WeightOfEachKova 3) PriceOfKova");
				NoOfSweets=sc.nextInt();
				weight=sc.nextDouble();
				price=sc.nextDouble();
				k.SetData1(NoOfSweets,92.36,price);
				k.SetData2(weight,"Sweet");
				k.GetInfo();
				TotalWeight+=weight*NoOfSweets;
				TotalPrice+=price*NoOfSweets;
				
				System.out.println("Total Weight of Gift is: "+TotalWeight+" grams TotalPrice of Gift: "+TotalPrice+"$");
			}
			else
			{
				System.out.println("Enter 1)numberofChewingGums  2)weightofEachChewingGums 3) PriceOfChewingGum");
				ChewingGums c=new ChewingGums();
				int NoOfCandies=sc.nextInt();
				double weight=sc.nextDouble();
				double price=sc.nextDouble();
				c.SetData1(NoOfCandies,192.36,price);
				c.SetData2(weight,"Sweet");
				c.GetInfo();
				TotalWeight+=weight*NoOfCandies;
				TotalPrice+=price*NoOfCandies;
			//	System.out.println("Total weights :"+TotalWeight+" Total Price"+TotalPrice);
				Chocolate cho=new Chocolate();
				System.out.println("Enter 1)numberofChocolates  2)weightofEachChocolate 3) PriceOfChocolate");
				 NoOfCandies=sc.nextInt();
				 weight=sc.nextDouble();
				 price=sc.nextDouble();
				cho.SetData1(NoOfCandies,78.36,price);
				cho.SetData2(weight,"Sweet");
				cho.GetInfo();
				TotalWeight+=weight*NoOfCandies;
				TotalPrice+=price*NoOfCandies;
				Lollypop lol=new Lollypop();
				System.out.println("Enter 1)NumberOfLollypops  2)WeightOfEachLollypop 3) PriceOfLollypop");
				NoOfCandies=sc.nextInt();
				weight=sc.nextDouble();
				price=sc.nextDouble();
				lol.SetData1(NoOfCandies,52.36,price);
				lol.SetData2(weight,"Sweet");
				lol.GetInfo();
				TotalWeight+=weight*NoOfCandies;
				TotalPrice+=price*NoOfCandies;
				
				System.out.println("Total Weight of Gift is: "+TotalWeight+" grams TotalPrice of Gift: "+TotalPrice+"$");
			}
			
		}
		
}
