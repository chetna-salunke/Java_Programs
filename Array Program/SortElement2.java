//WAJP to accessing the element of array using built in method of Arrays class that is toString() method

import java.util.*;
class SortElement2
{
	public static void main(String[] args) 
	{
		SortElement2 s=new SortElement2();
		System.out.println(s);
		int[] arr={7,8,3,5,9,2};
		System.out.println("Element before sorting");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("Elements after sorting");
		Arrays.sort(arr);//inbuilt method of arrays
		System.out.print(Arrays.toString(arr));
	}
}