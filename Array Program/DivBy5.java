//WAJP to Print The elements which is divisible by 5 from an array

import java.util.Scanner;
class DivBy5
{
	public static void main(String [] args){
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
		//Below for loop is used to access an element in an array
		System.out.println("The Result is: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0)
			{
				System.out.println("The Element which is divisble by 5 is: "+arr[i]);
		    }
		
	}
	
	
	}
}