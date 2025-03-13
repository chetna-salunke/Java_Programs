//WAJP to access the odd elements from an array.

import java.util.Scanner;
class  AccessOdd
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
		
		System.out.println("The odd no from the array is:");
		for (int i=0;i<arr.length ;i++ )
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i] +" ");
			}
		}
	}
}
