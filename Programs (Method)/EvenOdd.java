//WAJP to define a method which returns the given no. is even or odd.

import java.util.Scanner;
class  EvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the number to check even or odd");
		int a=sc.nextInt();
		System.out.println(a + " "  +evenOdd(a));
	}
	public static String evenOdd(int a)
	{
		if(a%2==0)
		{
			return " is even";
		}
		else{
			return "is odd";
		}
	}
}
