//WAJP to print even no. of words from a given string.

  class EvenWord
{
	public static void main(String[] args) 
	{
		String str="Java Is A Programming Language";
		String[] arr=str.split(" ");
	   for(int i=0;i<arr.length;i++)
       {
			if(arr[i].length()>0)
				if(arr[i].length()%2==0)
			    {
			      System.out.println(arr[i]+" = "+arr[i].length());
	            } 
		}
    }
}