//WAJP To identify the count /number of positive elements and number of negative elements

import java.util.Scanner;
class CountPosNeg
{
	public static void main(String[]args){
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

		int pos=0;
		int neg=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				pos++;
		    }
		    else
		   {
		    	neg++;
     	   }
		}
	System.out.println("The count of Positive element is: "+pos);
	System.out.println("The count of negative element is: "+neg);
}
}