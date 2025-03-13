class  Pattern35
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch='A';
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2==0)
		           System.out.print(ch +" ");

				else
					System.out.print(a +" ");
	         }

			 if(i%2==0)
				 ch++;
			 else
				 a++;
	
	        System.out.println();
        }
	}
}


/*

1 1 1 1
A A A A
2 2 2 2
B B B B

*/