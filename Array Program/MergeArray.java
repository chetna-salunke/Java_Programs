//WAJP to merge two arrays.

class MergeArray 
{
    public static void main(String[] args) 
	{
        int arr[] = {1, 2, 3, 4};
        int b[] = {8, 9};
        int c[] = new int[arr.length + b.length];
        int j = 0;

        for (int i = 0; i < c.length; i++) 
		{
            if (i < arr.length) 
			{
                c[i] = arr[i];
            }
			else 
			{
                c[i] = b[j];
                j++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
