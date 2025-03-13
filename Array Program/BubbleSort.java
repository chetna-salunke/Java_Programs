import java.util.*;
class BubbleSort
{
	public static void main(String[] args) 
	{
		int []arr={5,3,2,1,7,32,21};
		for(int i=0;i<arr.length;i++)
		{
		for(int j=1;j<arr.length-i;j++)
			{
			if(arr[j-1]>arr[j])
				{
				int temp;
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}