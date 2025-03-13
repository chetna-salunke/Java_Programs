//WAJP to print frequency of duplicate element.

class FrequencyDuplicate
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,1,4,5, 8,3, 4,3,6};
		for (int i=0;i<arr.length;i++ )
		{
			int count=1;
		    for (int j=i+1;j<arr.length ;j++ )
		    {
				 if(arr[i]==arr[j])
			    {
				   arr[j]=-1;
				   count++;
			     }
		    }
			if (count>1 && arr[i]!=-1)
			{
			    System.out.println("duplicate no of :"+ arr[i] + " frequency is " + count);
			 }
		}
		
	}
}


