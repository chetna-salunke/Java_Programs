class  Pattern20
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<n+i ;j++ )
			{
				if(i+j>n)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		//In worst case use this
		/*
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n ;j++ )
			{
				if(i+j>=n+1)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			for (int j=2;j<=n ;j++ )
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		*/
	}
}

/*
            *
         * * *
      * * * * *
   * * * * * * *
* * * * * * * * *

*/


