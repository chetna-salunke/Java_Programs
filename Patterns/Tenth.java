class Tenth 
{
	public static void main(String[] args) 
	{
		int n=3;
		for(int i=1;i>=1;i--	)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 && i!=n|| j==n && i !=n  || i==n/2+1 && i==n)
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
}
			//not done