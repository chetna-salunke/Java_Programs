//WAJP to identify the smallest element in an array.

import java.util.Scanner;
class SmallDigit 
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
		
		//Identifying the smallest element in Array
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
		     }
	     }
	    System.out.println("The smallest digit in array is: "+small);
    }
}