import java.util.*;

class RandomGenerator
{
	public static int randint(int a,int b)
	{
		Random r=new Random();
		return (r.nextInt((b-a)+1)+a);
	}
	public static double randdouble(int a,int b)
	{
		Random r=new Random();
		return (a+(b-a)*r.nextDouble());
	}
}
class RandomHelper
{
	public static void main(String[] args)
	{
		
		System.out.println(RandomGenerator.randint(1,10));
		System.out.println(RandomGenerator.randdouble(10,20));
		
	}
}
