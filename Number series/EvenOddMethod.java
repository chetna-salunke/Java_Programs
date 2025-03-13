import java.util.Scanner;
class EvenOddMethod 
{
	public static void main(String [] args)
	{
		int num=27;
		String res= EvenOdd(num);
		System.out.println(res);
	}
	public static String EvenOdd(int num)
	{
		if(num%2==0)
		{
			return num +"number is even";
		}
		else{
			return num +" number is odd";
		}
	}
}
