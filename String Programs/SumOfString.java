//WAJp to identify the sum of given digits from given string.

class SumOfString{
    public static void main(String[] args) {
        String s="ab12@4d8#";
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            sum=sum+ s.charAt(i)-'0';
        }
        System.out.println("the sum is " +sum);
      
    }
}