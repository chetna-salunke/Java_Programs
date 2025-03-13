// WAJP to find 3rd largest value  from an array
class  ThirdLarge
{
	public static void main(String[] args) 
	{
        int arr[]={112,52,32,44,10};
		int max=0;
		int max2=0;
		int max3=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max3=max2;
				max2=max;
				max=arr[i];
		     }
			 else if(max2 <arr[i] && max!=arr[i])
			 {
				 max2=arr[i];
			 }
			 else if(max3<arr[i] && max2!=arr[i] && max!=arr[i])
			{
				max3=arr[i];
			}
	     }
		System.out.println("first largest num: "+max);
		System.out.println("second largest num: "+ max2);
		System.out.println("third largest num: "+ max3);

	}
}

//another way 

/*
int arr[] a={
	Arrays.sort(a);
		sop(a[a.length-2]);
}
*/