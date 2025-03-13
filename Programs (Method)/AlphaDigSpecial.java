// WAJP to define a method which returns the character  is alpahabet, digit or special character. 

import java.util.Scanner;
class  AlphaDigSpecial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any character, digit to check ");
		char ch=sc.next().charAt(0);

		System.out.println(ch + " "+ charDigit(ch));
	}

	public static String charDigit(char ch)
	{
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			return "is character";
	}
	else if(ch>='0' && ch<='9')
		{
			return "is digit";
		}
		else{
			return "is special character";
		}
}
}
