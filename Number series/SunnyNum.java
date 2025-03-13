// WAJP to check the given no. is sunny no. or not

class  SunnyNum
{
	public static void main(String[] args) 
	{
		int num=8;
		int num1=num+1;
		int a=0;
		for(int i=1;i<=num1/2;i++)
		{
			if(num1==i*i)
			{
				a=i*i;
				break;
			}
		}
		if(a==num1)
		{ 
		  System.out.println(num+ "Sunny number");
		}
		else{
			System.out.println(num+ " is not Sunny number");
		}

	} 
}
 