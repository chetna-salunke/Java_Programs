//WAJP to check whether the given number is prime no. or not.

import java.util.Scanner;
class PrimeNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any  number");
		int num =sc.nextInt();
		String res=perfect(num);
		System.out.println(res);
	}

	public static String perfect(int num)
	{
		int count=0;
		for (int i=1;i<=num ;i++ )
		{
			if(num%i==0)
			{
			   count++;
			}
		}
		
		if(count==2)
		{
		    return	"its prime no";
		}
		else
		{
			return "its not prime no";
		}
	}
}