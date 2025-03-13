//WAJP to count the no. of spaces presentin given string.

class CountSpaces{
    public static void main(String[] args) 
    {
        String s=" Java Is A Programming Language ";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)==' ')
          {
            count++;
          }
        }
        System.out.println("count of spaces is :"+ count);
    }
}