class ParameterizedMethods
{
	private int width;
	private int height;
	private double depth;
	void initialize(int width,int height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	double getVolume()
	{
		return ((double)width*height*depth);
	}
}	
class Box
{
	public static void main(String[] args)
	{
		ParameterizedMethods p=new ParameterizedMethods();
		p.initialize(10,10,10.5);
		double vol=p.getVolume();
		System.out.println(vol);	
	}
}