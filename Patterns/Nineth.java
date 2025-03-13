class Nineth 
{
	public static void main(String[] args) 
	{
		int n=3;
		for(int i=1;i<=n;i--)
		{
			for (int j=1;j<=n ;j++ )
			{
				if(j==1  && i!=n||j==3 && i!=n || i==3 && j==2 || i==1 && j==n/2 )

					System.out.print("* ");
	
				else
					System.out.print("  ");
		   }
		   System.out.println();
		}
	}
	
}


/*

*   * 
*   *
  *

*/
