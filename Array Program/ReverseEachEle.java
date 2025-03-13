//WAJP to reverse the each element in an array

class  ReverseEachEle
{
	public static void main(String[] args) 
	{
		int arr[]={12,35,87,34};

        System.out.println("before reversing the element");
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		System.out.println("after reversing the element");

		for(int i =0;i<arr.length;i++)
		{
			int rev=0;
			while(arr[i]!=0)
			{
				int rem=arr[i]%10;
				rev=rev*10+rem;
				arr[i]=arr[i]/10;
			}
			System.out.println(rev);
		}
	}
}
