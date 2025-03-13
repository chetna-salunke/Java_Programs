//WAJP to print the prime no from given range.
 
class  PrimeNumRange
{
	public static void main(String[] args) 
	{
		int num=12;
		for(int i=3;i<=num;i++)
		{
		    int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
			    {
				  count++;
			    }
			 }
				if(count==2)
		        {
			       System.out.println( i+ " is prime no");
		         }
	      }
	 }
}