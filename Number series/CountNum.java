//WAJP to count the number of digits in the given number.

import java.util.Scanner;
class CountNum 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Please Enter numbers");
		int num= s.nextInt();
		int count=0;
		
		while(num!=0)
		{
			
			count++;
			num=num/10;
		}
		System.out.println("the count of given number is: "+count);
	}
}
