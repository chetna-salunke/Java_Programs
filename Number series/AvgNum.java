//WAJP to identify the average of digits present in a number 

import java.util.Scanner;
class AvgNum
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Please Enter numbers");
		int num= s.nextInt();
		int sum=0;
		int rem=0;
		int count=0;
		while(num!=0)
		{
			rem=num%10;
			sum+=rem;
			count++ ;
			num=num/10;
		}
		System.out.println("the average of given number is: "+sum/count);
	}
}
