//WAJP to search an element in an array

import java.util.Scanner;
class SearchElement
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
		System.out.println("Enter the element to be searched");

		int search=s.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]==search)
			{
			   count++;
		       System.out.println("Element is Present");	
		        break;
			 }
	     }
	    if(count==0)
		{
	    	System.out.println("Element is Not Present");	
         }
    }
}

/*
		System.out.println("Enter the element to be searched");
		int search=s.nextInt();

		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]==search)
			{
			   flag=true;
		       break;
			}
	    }
	    if(flag==true)
		{
		   System.out.println("Element is  Present");	
        }
        else
		{
	       System.out.println("Element is Not  Present");	
       }
*/
