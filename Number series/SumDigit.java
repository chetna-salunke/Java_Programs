// WAJP to identify the sum of digits.

import java.util.Scanner;
class SumDigit 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Please Enter numbers");
		int num= s.nextInt();
		int sum=0;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			sum+=rem;
			num=num/10;
		}
		System.out.println("the sum of given number is: "+sum);
	}
}
