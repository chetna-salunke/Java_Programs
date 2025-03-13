//WAJP to identify the average of elements in an array.

import java.util.Scanner;
class  AvgElement
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array" );
		int size=sc.nextInt();

		int arr[]= new int[size];
		System.out.println("the size of an array is:" +arr.length);

		System.out.println("Enter the elements in array");
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for (int i=0;i<arr.length ;i++ )
		{
			 sum+=arr[i];
		}
		System.out.print("The average  of the elemnets in array is:" +sum/arr.length    );
	}
}

