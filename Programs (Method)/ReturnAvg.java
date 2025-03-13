//WAJP to define methods which returns the average value.

import java.util.Scanner;
class   ReturnAvg
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any  4 digit  number");
		int num =sc.nextInt();
		
		int  sum =sumNum(num);
		System.out.println("the sum of digit is:" +sum);
		
		int count =countNum(num);
		System.out.println("the count of digit is:" +count);

		int res= avgNum(sum,count);
		System.out.println("the average of digit is:" +res);
	}

	public  static int sumNum(int num)
	{
	    int sum=0;
	    while(num!=0)
	   {
		  sum=sum+num%10;
		  num=num/10;
		}
		return sum;
	}

	public static int countNum(int num)
	{
	    int count=0;
        while(num!=0)
	   {
			count++;
		   num=num/10;
		}
		return count;
	}
	public static int avgNum(int sum, int count)
		{
			return sum/count;
		}
}
	