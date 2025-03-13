//2WAJP to remove the element from the specified position.

import java.util.Scanner;
class  RemoveSpecifiedEle
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();

		int arr[]= new int[size];
	
		System.out.println("Enter the element in an array");
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=sc.nextInt();
		}

        System.out.println("Enter the position you want to delete");
		int pos=sc.nextInt();

		 if (pos<0 || pos>arr.length)
         {
			 System.out.println("invalid position");
         }
		 else
		{
			for(int i=pos-1;i<arr.length-1 ;i++)
	    	{
				arr[i]=arr[i+1];
		    }
			 
			System.out.println("the elements are after removing");
		    for(int i=0;i<arr.length-1 ;i++ )
		    {
		    	System.out.print(arr[i]);
		     }
		}
	}
}
