//WAJP to insert an element in an specified position without loosing the data.

import java.util.Scanner;
class  InsertWithoutLoosing
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();

		int arr[]= new int[size];
		int b[]=new int[size+1]; 
  
		System.out.println("Enter the element in an array");
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=sc.nextInt();
		}

        System.out.println("Enter the position");
		int pos=sc.nextInt();

		System.out.println("Enter the element you want to insert it in to an array");
		int user=sc.nextInt();

		 if (pos<0 || pos>arr.length)
         {
			 System.out.println("invalid position");
         }
		 else
		{
			for (int i=arr.length-1;i>=pos-1 ;i-- )
	    	{
				b[i+1]=arr[i];
		    }
		    b[pos-1]=user;
			
			for (int i=0;i<pos-1 ;i++ )
		    {
				b[i]=arr[i];
		    }
			System.out.println("the elements are after inserting new no.");
		    for (int i=0;i<b.length ;i++ )
		    {
		    	System.out.print( b[i]);
		    }
		}

	}
}
