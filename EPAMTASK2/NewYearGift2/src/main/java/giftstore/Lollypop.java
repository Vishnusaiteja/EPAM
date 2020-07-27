package giftstore;

public class Lollypop extends Candy{
	private int NoOfCandies;
	private double Price;
	private String Type;
	double Calories,Weight;
	
	public void SetData1(int NoOfCandies,double Calories,double Price){
		this.NoOfCandies=NoOfCandies;
		this.Calories=Calories;
		this.Price=Price;
	}
	
	public void SetData2(double Weight,String Type)
	{
		this.Weight=Weight;
		this.Type=Type;
	}

	public void GetInfo() {
		System.out.println("The type Gift: "+Type+" Weight :"+Weight+"grams Calories: "+Calories+"Cal Price: "+Price+"$ NoOfUnits :"+NoOfCandies);
	}


	
}
