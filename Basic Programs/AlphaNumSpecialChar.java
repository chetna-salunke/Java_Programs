import java.util.Scanner;
class AlphaNumSpecialChar 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("please enter any character");
		char ch= s.next().charAt(0);
		if(ch>='A'&& ch<='Z' || ch>='a' && ch<='z')
		{
			System.out.println( ch + " Given charcter is Alphabet");
		}
		else if(ch>=0 && ch<=9 )
		{
			System.out.println(ch +" Given charcter is Number");
		}
		else{
			System.out.println(ch+ " its Special character");
		}

}
}