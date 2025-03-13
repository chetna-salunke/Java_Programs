//WAJP to define a method which returns  the factors of a given number.

import java.util.Scanner;
class  FactorSum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any  number");
		int num =sc.nextInt();
		String res=factor(num);
		System.out.println(res);
	}

	public static String factor(int num)
	{
		int sum=0;
	    for(int i =1;i<=num;i++)
	   {
	     	if(num%i==0)
		   {
			    sum=sum+i;
		    }
	   }
	   return "factors of num are :"+ sum;
	
     }
}
