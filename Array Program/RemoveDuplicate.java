//WAJP to remove the duplicate

class  RemoveDuplicate
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,1,4,3,5,6};
		for (int i=0;i<arr.length;i++ )
		{
		    for (int j=i+1;j<arr.length ;j++ )
		    {
				 if(arr[i]==arr[j])
			    {
				   arr[j]=-1;
			     }
		    }
			if (arr[i]!=-1)
			{
			    System.out.println(arr[i]);
			 }
		}
		
	}
}
