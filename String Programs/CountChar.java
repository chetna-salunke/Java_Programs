//WAJP to count the no. of character present in each word.

class CountChar{
    public static void main(String[] args) {
        String s="java is programming langugae";
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
            else
            {
                System.out.println(count);
                count=0;
            }
        }
        System.out.println(count);
    }
}
