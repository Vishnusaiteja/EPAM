class MatrixMax
{
	public static void main(String[] args)
	{

		if(args.length==9)
		{
			int max=Integer.parseInt(args[0]);
			System.out.println("The given array is :");
			System.out.print(Integer.parseInt(args[0])+" ");
			for(int i=1;i<9;i++)
			{
				if(Integer.parseInt(args[i])>max)
					max=Integer.parseInt(args[i]);
				System.out.print(Integer.parseInt(args[i])+" ");
				if((i+1)%3==0)
					System.out.println();
			}
			System.out.println("\nThe biggest number in the given array is "+max);

		}
		else
		{
			System.out.println("Please enter 9 integer numbers");
		}
	}
}