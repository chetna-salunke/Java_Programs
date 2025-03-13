// WAJP to check whether the given number is disarium no. or not. (the sum of digits to the power of thier respective positon is equal to given no.known as Disarium no. or sum of power of each digit based on the positon is equals to given no.)

class  Disarium
{
	public static void main(String[] args) 
	{
		int num=135;
		int num1=num;
		int num2=num1;
		int sum=0;
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		while(num1!=0)
		{
			int rem=num1%10;
			int power=1;

		    for(int i=1;i<=count;i++)
			{
				power=power*rem;
			}
			count--;
			sum= sum+ power;
			num1=num1/10;
		}
		if(sum==num2)
		{
			System.out.println(num2+ " is Disarium");
		}
		else{
			System.out.println(num2+ " is  not Disarium");
		}
   	}
}
