class  Pattern36
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch='A';
		int a=2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2==0 )
		          System.out.print(ch++  +" ");

				else
					System.out.print(a +" ");
				 a=a+2;
	         }
			a=2;
	      System.out.println();
       }
	}
}


// insted of using a, we can use  directly j*2 in else block
/*

2 4 6 8
A B C D
2 4 6 8
E F G H

*/