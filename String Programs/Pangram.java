//WAJP To check that given string is Pangram or not.

class Pangram
{
public static void main(String[] args)
{
String s="abcdefghijklmnopqrstuvwxyz";
s=s.toLowerCase();
int count=0;
char[] ch=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
for(int j=i+1;j<ch.length;j++)
{
if(ch[i]==ch[j])
{
ch[j]=' ';
}
}
 }
for(int i=0;i<ch.length;i++)
{
if(ch[i]>='a' && ch[i]<='z' && ch[i]!=' ')
{
count++;
}
}
if(count==26)
System.out.println("Panagram");
else
System.out.println("Not Panagram");
}
}
