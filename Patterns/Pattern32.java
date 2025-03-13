class  Pattern32
{
	public static void main(String[] args) 
	{
		int n=5;
		char ch='A';
		int a=1;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n;j++ )
			{
				if(i<=j)
				{
					if(i%2==0)
					System.out.print(a++ + " ");

					else
                    System.out.print(ch++ + " ");
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

A B C D E
   1 2 3 4
      F G H
         5 6
            I
*/