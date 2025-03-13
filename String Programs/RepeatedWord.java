//WAJP to print repeated words in a string

class RepeatedWord
{
public static void main(String[] args)
{
String s="abc is a abc";
 String[] s1=s.split(" ");
 for(int i=0;i<s1.length;i++){
 int count=0;
 for(int j=i+1;j<s1.length;j++){
 if(s1[i].equals(s1[j])){
 count++;
 s1[j]=" ";
 }
 }
 if(count>0)
System.out.println("The Repeated Word is: "+s1[i]);
}
}
}
