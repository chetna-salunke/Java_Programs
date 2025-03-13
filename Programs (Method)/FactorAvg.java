//WAJP to define a method which returns  the average of factors of a given number.

import java.util.Scanner;
class  FactorAvg
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any  number");
		int num =sc.nextInt();
		double res=factor(num);
		System.out.println("average  factor of digit is: " +res);
	}

	public static double factor(int num)
	{
		int sum=0;
		int count =0;
	    for(int i =1;i<=num;i++)
	   {
	     	if(num%i==0)
		   {
			    sum=sum+i;
				count++;
		    }
	   }
	   return sum/count;
	
     }
}
