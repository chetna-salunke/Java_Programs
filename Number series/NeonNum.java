// WAJP to check given no. is neon no. or not

class  NeonNum
{
	public static void main(String[] args) 
	{
		int num=9;
		int num1=num*num;//81
		int sum=0;
		while(num1!=0)
		{
			sum=sum+num1%10;
			num1=num1/10;
		}
		if(num==sum)
		{
		    System.out.println(num + " is neaon Number");
		}
		else{
			System.out.println(num + " is not neon Number");
		}
	}
}
