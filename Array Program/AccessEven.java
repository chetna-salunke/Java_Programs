//WAJP to access the even elements from an array.
import java.util.Scanner;
class   AccessEven
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array" );
		int size=sc.nextInt();

		int arr[]= new int[size];
		System.out.println("the size of an array is:" +arr.length);

		System.out.println("Enter the elements in array");
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The even no from the array is:");
		for (int i=0;i<arr.length ;i++ )
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i] +" ");
			}
		}

	}
}
