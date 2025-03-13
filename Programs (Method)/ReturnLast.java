// WAJP  to define a method which return last digit of given no.

import java.util.Scanner;
class   ReturnLast
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any  number");
		int num=sc.nextInt();
		System.out.println("the last digit of the given number is:" + returnlast(num));

	}
	public static int returnlast(int num)
	{
		int num=a;
		num=num%10;
		return num;
	}
}
