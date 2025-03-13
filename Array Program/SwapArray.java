//WAJP to swap 1st half array with 2nd half of array.
public class SwapArray{

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60};
		int mid;
		if(a.length%2==0) {
			mid = a.length/2;
		}
		else 
		{
			mid = a.length/2+1;
		}
			for(int i=0; i<a.length/2; i++) 
			{
				int temp = a[i];
				a[i] =  a[mid];
				a[mid]= temp;
				mid++;
			}
			for(int i=0; i<a.length; i++) 
			{
				System.out.println( " "+a[i]);
			} 

	}
}