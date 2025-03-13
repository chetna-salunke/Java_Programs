// WAJP to identify the smallest digit in a number.

import java.util.Scanner;
class  FindSmall
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Please Enter numbers");
		int num= s.nextInt();
		int small=num%10;
		num=num/10;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			if(small>rem){
				small=rem;
			}
			num=num/10;

		}
		System.out.println("the smallest digit from given number is: "+small);
	}

}
