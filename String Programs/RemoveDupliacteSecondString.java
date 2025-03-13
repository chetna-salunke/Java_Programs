//WAJP to Remove the duplicate Character from the second string
import java.util.*;
class RemoveDupliacteSecondString
{
public static void main(String[] args)
{
String s1="Helo";
String s2="Fellow";
s1=s1.toLowerCase();
s2=s2.toLowerCase();
char[] ch1=s1.toCharArray();
char [] ch2=s2.toCharArray();
for(int i=0;i<s1.length();i++){
int count=0;
for(int j=0;j<s2.length();j++){
if(ch1[i]==ch2[j]){
ch2[j]=' ';
break;
 }
}
}
System.out.println(Arrays.toString(ch2));
for(int i=0;i<ch2.length;i++){
if(ch2[i]!=' ')
System.out.println(ch2[i]);
 }
 }
 }