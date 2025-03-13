class  Pattern33
{
	public static void main(String[] args) 
	{
		int n=3;
		char ch='A';
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( i-j<n && i+j>n )
				{
	            	System.out.print(ch++ +" ");
	            }
	            else
				{
		            System.out.print("  ");
                 }
			}
			System.out.println();
		}
	}
}


/*

       A
    B C
 D E F
   G H
       I
*/
