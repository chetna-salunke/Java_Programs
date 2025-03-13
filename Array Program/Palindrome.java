//]WAJP to check whether the string is a palindrome or not.

import java.util.Scanner;
class Palindrome
{

	 public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array.");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int rev[] = new int[size];
		boolean flag = false;
		int t = arr.length-1;
		System.out.println("The array size is: "+size);
		System.out.println("Enter the array elements: ");
		
		//The below for loop is used to request or store elements in an array.
		for(int i=0; i<arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The result is: ");
		
      //The below for loop is used to access elements from an array.
		for(int i=0; i<arr.length; i++) 
		{
			rev[t] = arr[i];
			t--;
		}
		for(int i=0; i<rev.length; i++) {
			System.out.print(rev[i]+" ");
		}
		
		System.out.println();
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i] == rev[i]) 
			{
				flag = true;
			}
		}

		if(flag == true) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not Palindrome Stirng");
		}
	}

}