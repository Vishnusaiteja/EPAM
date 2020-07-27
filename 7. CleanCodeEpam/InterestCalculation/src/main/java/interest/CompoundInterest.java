package interest;

public class CompoundInterest {
	public static double estimate(double principle ,double rateofinterest,double numberoftimesinterestapplied,double timeelapsed)
	{
		return principle*(Math.pow(1+(rateofinterest/numberoftimesinterestapplied),numberoftimesinterestapplied*timeelapsed ));
	}
}
