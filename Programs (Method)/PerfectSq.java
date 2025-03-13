//WAJP to check whether the given no is a perfect square or not.

import java.util.Scanner;
class PerfectSq
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
		int a=0;
		for (int i=1;i<=num ;i++ )
		{
			if(num==i*i)
			{
				a=i*i;
				break;
			}
		}
		if(num==a)
		{
		    return	"its perfect square";
		}
		else
		{
			return "its not perfect square";
		}
	}
}