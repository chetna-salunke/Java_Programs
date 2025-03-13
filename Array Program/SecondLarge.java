//WAJP to find out the second largest element from an array.

class SecondLarge
{
	public static void main(String[] args)
	{
		int arr[]={112,52,32,44,10};
		System.out.println();
		for (int i=0;i<arr.length ;i++ )
		{
             System.out.println(arr[i]);
		}
        
		int large=0;
		//int large=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(large<arr[i])
			{
				large=arr[i];
		     }
	     }

		 int large2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(large2<arr[i] && arr[i]<large)
			{
				large2=arr[i];
		     }
	     }
		System.out.println("first largest num: "+large);
		System.out.println("second largest num: "+ large2);
	    
	}
}


//2nd way
/*
        int arr[]={112,52,32,44,10};
		int max=0
		int max2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<a[i])
			{
				max2=max;
				max=arr[i];
		     }
			 else if(max2 <arr[i] && max!=arr[i])
			 {
				 max2=arr[i];
			 }
	     }
		System.out.println("first largest num: "+max);
		System.out.println("second largest num: "+ max2);
	    
		*/

