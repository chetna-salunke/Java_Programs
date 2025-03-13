//WAJP to define a method which returns the given no.is strong no or weak no.

import java.util.Scanner;
class  StrongWeak
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any  numbers");
		int num =sc.nextInt();
        int sum=sumFactor(num);
		System.out.println("the sum of digit is:" +sum);
		 
		String res= result(num, sum);
		System.out.println(num + " "  + res);
			
	}
	public static int sumFactor(int num)
	{
		int sum=0;
		while(num!=0)
		{ 
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem ;i++)
			{
				fact=fact*1;
			}
			sum=sum+fact;
			num=num/10;
		}
		return sum;
	}
	public static String result(int sum, int num)
	{
		if(num==sum)
		{
			return "number is strong";
		}
		else
		{
			return "number is weak";
        }
	}
}