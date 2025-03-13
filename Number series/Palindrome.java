// WAJP will check the given number, which is palindrome.

class Palindrome
{
	public static void main(String[] args) 
	{
		int num=1221;
	    int temp=num;
	    int rev=0;
	    int rem= 0;
     	while(num!=0)
	   {
		  rem=num%10;
		  rev=rev*10+rem;
		  num=num/10;
	   }
	   if(temp==rev)
	   {
		  System.out.println("The given number is palindrome" +num);
	   }
	   else 
	   {
		  System.out.println("The given number is not palindrome" +num);
		}
    } 
}