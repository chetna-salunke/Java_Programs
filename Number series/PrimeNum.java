//WAJP to check the given number is prime no. or not. (Note: the no.which s divisible by 1 & iteslef is known as Prime No.)

class  PrimeNum
{
	public static void main(String[] args) 
	{
		int num=7;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		System.out.println("count is:" +count );
		if(count==2)
		{
			System.out.println( num+ " is prime no");
			
		}
		else{
			System.out.println( num+ " is not prime no");
		}


	}
}
