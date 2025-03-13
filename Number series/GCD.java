//WAJP to identify the greatest common divisor of the no's.(6-->1,2,3,6)(8-->1,2,4,8)(2=2is gcd).
class  Gcd
{
	public static void main(String[] args) 
	{
		int num=16;
		int num1=8;
		int gcd=0;

		for(int i=1;(i<=num && i<=num1);i++)
		{
		    if(num% i==0 && num1% i==0)
		   {
			  gcd=i;
		   }

		}
					
		System.out.println("the greatesty divisor is: " +gcd);
	}
}
 