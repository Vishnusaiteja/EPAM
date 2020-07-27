package interest;

public class SimpleInterest {
	public static double estimate(double principleamount,double rateofinterest,double time)
	{
	
		double calculatedinterest;
		calculatedinterest=((principleamount*rateofinterest*time)/100);
		return calculatedinterest;
	}

}
