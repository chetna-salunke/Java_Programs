//WAJP to store the elements in an array and access the elements one by one. (note:make use of Scanner class to request the data from the end-user)

import java.util.Scanner;
class  AccessElement
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
         System.out.println("Enter the size of an array");
		 int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("The size of an array is: "+ arr.length);

        //the below for loop is used to store the lement s in array 

		System.out.println("Enter the elements in an array");
		for(int idx=0;idx<arr.length;idx++)
		{
			arr[idx]=sc.nextInt();
		}

		//the bleow loop is used for access the lements from an array
		System.out.println("The result is :");
		for(int idx=0;idx<arr.length;idx++)
		{
			System.out.print (arr[idx] +" ");
		}

	}
}
 