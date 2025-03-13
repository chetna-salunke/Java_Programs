//WAJP to define a method which returns the reverse no . and a method which return  the given no. is palindrome or not.

import java.util.Scanner;
class  Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any  numbers");
		int num =sc.nextInt();

		int rev= reverse(num);
		System.out.println("after reverse the number:" +rev);

		String res=palindrome(rev,num);
		System.out.println("the given number : " +res);
	}

	public static int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
	public static String palindrome(int  rev, int num)
	{
		if(rev==num)
		{
			return " is palindrome";
	   }
	   else{
		   return " is not palindrome";
	   }
	}
}
