//WAJP to print the prime elements from an array.

public class PrimeNo{
    public static void main(String[] args) {
        int arr[]={6,3,4,5,11,7,9};
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
           for(int j=2;j<=arr[i]/2;j++)
           {
            if(arr[i]%j==0)
            {
                count++;
            }
           }
           if(count==0)
        {
            System.out.println("the prime no are " +arr[i]);
        }
        }
        
    }


}