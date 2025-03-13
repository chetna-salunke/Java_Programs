//WAJP To check given string is palindrome or not.

class Palindrome
{
public static void main(String[] args)
{
String s="Madam";
String s2=s.toLowerCase();
String rev="";
for(int i=s2.length()-1;i>=0;i--)
{
rev=rev+s2.charAt(i);
}
if (s2.equals(rev))
System.out.println("String is Palindrome");
else
System.out.println("String is Not Palindrome");
}
}