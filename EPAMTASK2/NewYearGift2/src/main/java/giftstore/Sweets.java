package giftstore;

public class Sweets implements Gift {
	private int NoOfSweets;
	private double Price;
	 String Type;
	double Calories,Weight;
	public void GetInfo() {
		System.out.println("The type Gift: "+Type+" Weight :"+Weight+"grams Calories: "+Calories+"Cal Price: "+Price+"$ NoOfUnits :"+NoOfSweets);
	}
	public void SetData1(int NoOfSweets,double Calories,double Price){
		this.NoOfSweets=NoOfSweets;
		this.Calories=Calories;
		this.Price=Price;
	}
	
	public void SetData2(double Weight,String Type)
	{
		this.Weight=Weight;
		this.Type=Type;
	}	
}