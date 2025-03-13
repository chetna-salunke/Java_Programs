//WAJP To print the largest and smallest words .
class LargeSmallWord
{
public static void main(String[] args)
{
String s="Java is a Programming Language";
String[] s1=s.split(" ");
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
int sm=0;
int l=0;
for(int i=0;i<s1.length;i++){
if(min>s1[i].length()){
min=s1[i].length();
sm=i;
}
if(max<s1[i].length()){
max=s1[i].length();
l=i;
}
}
System.out.println(s1[l]+" "+max);
System.out.println(s1[sm]+" "+min);
}
}