//WAJP To reverse the given array

import java.util.Scanner;
class ReverseElement
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

		//Below for loop is used to access an element in an array
		System.out.println("The Result Of reverse Array is: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			
			System.out.println(arr[i]);
		}
		
	}
}

		
/*		//2nd logic to reverse elements in an array.
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array.");
		int size = sc.nextInt();
		int a[] = new int[size];
		int start = 0;
		int end = a.length-1;
		System.out.println("The array size is: "+size);
		System.out.println("Enter the array elements: ");
		
		//The below for loop is used to request or store elements in an array.
		for(int i=0; i<a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("The result is: ");
		// The below while loop is used to reverse elements in an array.
        while(start < end) {
        	int temp = a[start];
        	a[start] = a[end];
        	a[end] = temp;
        	start++;
        	end--;
        }
        
      //The below for loop is used to access elements from an array.
        for(int i=0; i<a.length;i++) 
		{
        	System.out.print(a[i]+" ");
        }
*/