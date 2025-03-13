//WAJP to identify the sum of elements present in array.
import java.util.Scanner;
class  SumElement
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array" );
		int size=sc.nextInt();

		int arr[]= new int[size];
		System.out.println("the size of an array is:" +arr.length);

		System.out.println("Enter the elements in array");
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The sum of the elemnets in array is:");
		int sum=0;
		for (int i=0;i<arr.length ;i++ )
		{
			 sum+=arr[i];
		}
		System.out.print(sum+" ");
	}
}
