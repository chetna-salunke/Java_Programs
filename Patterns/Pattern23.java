class  Pattern23
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=1;i<n-1 ;i++)
		{
			for (int j=1;j<n+i ;j++ )
			{
				if(i+j>n)
				{
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
			
		for (int i=n-1;i>0;i--)
		{
			for (int j=1;j<n+i ;j++ )
			{
				if(i+j>n)
				{
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

/* another way to print diamond
	public static void main(String[] args) 
	{
		int n=3;
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
			if(i+j>n && j-i<n && i-j<n && i+j<n*3)
				{
				System.out.print("* ");
				}
				else{
		System.out.print("  ");
	}
			}
			System.out.println();
}
	}

	*/

/*

           *
        * * *
     * * * * *
  * * * * * * *
     * * * * *
        * * *
           *
	*/