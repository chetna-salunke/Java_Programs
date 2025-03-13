//WAJP to find pair of element is equal to given number/ sum of two elemnts equals to given no.

import java.util.Scanner;
class PairOfEle
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
		
	  System.out.println("enter the element");
	  int ele=s.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			    if(arr[i]+arr[j]==ele)
			    {
			    	System.out.println("The pair are: " + arr[i]+ " "+arr[j]);
		         }
     	     }
        }
    }
}