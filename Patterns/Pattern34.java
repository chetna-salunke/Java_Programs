class  Pattern34
{
	public static void main(String[] args) 
	{
		int n=4;
		int a=1;
		int sum=0;
		int b=1;
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n ;j++ )
			{
				if(i>=j)
				{
					System.out.print(a+"  ");
					sum=a+b;
					a=b;
					b=sum;
					
				}
				else{
				    System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

/*

1
1  2
3  5  8
13  21  34  55

*/