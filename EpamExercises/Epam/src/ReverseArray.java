class ReverseArray
{
	public static void main(String[] args)
	{
		int[] matr=new int[4];
		if(args.length!=4)
		{
			System.out.println("Please enter 4 integer numbers ");
		}
		else
		{
			System.out.println("The given array is :");
			for(int i=0;i<4;i++)
			{
				System.out.print(args[i]+" ");
				if((i+1)%2==0)
					System.out.println();
			}

			for(int i=0;i<4;i++)
			{
				matr[i]=Integer.parseInt(args[4-i-1]);
			}
			for(int i=0;i<4;i++){
				System.out.print(matr[i]+" ");
				if((i+1)%2==0)
					System.out.println();
			}
		}
	}
}