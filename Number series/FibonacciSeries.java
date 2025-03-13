// WAJP for Fibonacci series.

class  FibonacciSeries
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
       System.out.print(a+ ", " +b);
		for (int i=1;i<=8;i++ )
		{
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(", " +sum);
		}

		//OR

		/*int a=0;
		int b=1;
		for (int i=1;i<=10;i++ )
		{
			System.out.print(a+", " );
			int sum=a+b;
			a=b;
			b=sum; 
		}*/
	}
}
