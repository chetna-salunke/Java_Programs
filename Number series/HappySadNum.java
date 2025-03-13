// WAJP tocheck given no. is happy no. or sad no. 
class  HappySadNum
{
	public static void main(String[] args) 
	{
		int num =23;
		
		while(true)
		{
			int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			int sq=rem*rem;
			sum=sum+sq;
			num=num/10;
		}
		if(sum==1)
		{ 
		   System.out.println("Its happy number");
		   break;
		}
		else if(sum==4)
		{
			System.out.println("Its sad number");
			break;
	     }
		 num=sum;
		}
}
}