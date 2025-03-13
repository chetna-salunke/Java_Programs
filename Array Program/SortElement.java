//WAJP to sort the elements in an array.

import java.util.Arrays;
class SortElement
{
	public static void main(String[] args) 
	{
		int[] arr={7,8,3,5,9,2};
		System.out.println("Element before sorting");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Elements after sorting");
		Arrays.sort(arr);//inbuilt method of arrays
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
	}
	}
}