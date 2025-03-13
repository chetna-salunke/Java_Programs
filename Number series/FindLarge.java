//WAJP to identify the largest digit in a number.

import java.util.Scanner;
class  FindLarge
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Please Enter numbers");
		int num= s.nextInt();
		int large=num%10;
		num=num/10;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			if(large<rem)
			{
				large=rem;
			}	
			num=num/10;
		}
		System.out.println("the largest digit from given number is: "+large);
	}

}
