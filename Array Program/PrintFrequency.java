//WAJP to print the frequency of each element.

class PrintFrequency
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,1,4,5, 5, 8,4,3,5,6};
		for (int i=0;i<arr.length;i++ )
		{
			int count=0;
		    for (int j=i+1;j<arr.length ;j++ )
		    {
				 if(arr[i]==arr[j])
			    {
				   arr[j]=-1;
				   count++;
			     }
		    }
			if (arr[i]!=-1)
			{
			    System.out.println(arr[i] + " frequency is " + count);
			 }
		}
		
	}
}

