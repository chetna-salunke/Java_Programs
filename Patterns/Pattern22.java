class  Pattern22
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=n;i>0 ;i-- )
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
			
		for (int i=1;i<=n;i++ )
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


/* loading

* * * * * * * * *
   * * * * * * *
      * * * * *
         * * *
            *
            *
         * * *
      * * * * *
   * * * * * * *
* * * * * * * * *

*/

/*
        int n=3;
		for (int i=1;i<=n*2-1; i++)
		{
			for (int j=1;j<=n*2-1 ;j++ )
			{
				if((j>=i && i+j<=n*2) || (j<=i && i+j>=n*2)){
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
					
				}

* * * * *
   * * *
      *
   * * *
* * * * *

*/
