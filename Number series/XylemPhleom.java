// WAJP to check given no. is xylem or Phleom. 

class  XylemPhleom
{
	public static void main(String[] args) 
	{
		int num=1234;
		int ld=num%10;
		num=num/10;
		int sum=0;
		while(num>9)
		{
			sum=sum+num%10;
			num=num/10;
		}
		int outersum=num+ld;
		if(outersum==sum)
		{	
		System.out.println("is Xylem");
		}
		else
		{	
		System.out.println("is phelom");
		}
	}
}
