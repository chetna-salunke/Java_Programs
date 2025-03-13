
//WAJP check given string is anagram or not.

import java.util.Arrays;
class Anagram
{
    public static void main(String[] args)
   {
String s1="Silent";
String s2="Listen";
if(s1.length()==s2.length())
{
s1=s1.toLowerCase();
s2=s2.toLowerCase();
char[] ch1=s1.toCharArray();
char[] ch2=s2.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
int count=0;
int i=0;
int j=0;
while(i<ch1.length)
{
if(ch1[i]==ch2[j])
count++;
else
break;
i++;
j++;
}
if( count==s1.length())
{
System.out.println("Given 2 strings are anagram of each other");
}
else{
System.out.println(" not anagram ");
 }
}
else{
System.out.println("Length is not matching so it is not Anagram");
}
}
 }