class  NamePrint
{
	public static void main(String[] args)  throws Exception
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{	
			//C
				for(int j=1;j<=n;j++)
			{
				if(j==1 ||i==1 ||i==n)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}

				Thread.sleep(150);
			}
				System.out.print("  ");

		
		//H

			for(int j=1;j<=n;j++)
			{
				if(j==1 || i==n/2+1||j==n)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
					Thread.sleep(150);
			}
			System.out.print("  ");

			//E
			
			for(int j=1;j<=n;j++)
			{
				if(i==1 ||j==1||i==n|| i==n/2+1)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
					Thread.sleep(150);
			}
			System.out.print("  ");

            //T
			for(int j=1;j<=n;j++)
			{
				if(i==1 || j==n/2+1)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
					Thread.sleep(150);
			}
			System.out.print("  ");

          //N

			for(int j=1;j<=n;j++)
			{
				if(j==1 ||i==j||j==n)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
					Thread.sleep(150);
			}
			System.out.print("  ");


			for(int j=1;j<=n;j++)
			{
				if(j==1 && i!=1|| j==n && i !=1 || i==1 && j!=1 && j!=n || i==n/2+1)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
					Thread.sleep(150);
			}			
			System.out.println();
		}

	}
}

/*
* * * * *   *          *   * * * * *   * * * * *   *         *     * * *
*               *          *   *                     *         *  *     *   *          *
*               * * * * *   * * * * *         *         *    *   *   * * * * *
*               *          *   *                     *         *      * *   *          *
* * * * *   *          *   * * * * *         *         *         *   *          *

*/