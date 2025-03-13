//WAJP to identify the highest sum of 2 numbers in an array

import java.util.Scanner;
class SumOf2Highest 
{
	public static void main(String[]args)
	{
	    Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=s.nextInt();
		int [] arr=new int[size];
		System.out.println("The size of array is: " +arr.length);

		//Below for loop is used to Store an element in an array
		System.out.println("Enter the elements of an array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		//Identifying the  element in Array
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			    if(sum<arr[i]+arr[j])
			   {
				   sum=arr[i]+arr[j];
				}
	        }
        }
       System.out.println("The Sum of 2 highest digit in array is: "+sum);
    }
}