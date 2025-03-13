//.WAJP to check given number is strong number or week number.
//(note: the summation of each digit factorial will be equals to the given no.then we call it as Strong no.)

class  StrongNumber
{
	public static void main(String[] args) 
	{
		int num=145;
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum)
		{
		   System.out.println(temp + "is a Strong number");
	    }
		else
		{
			System.out.println(temp + "is a Weak number");
		}
    }
}
