//WAJP to count the character present in given String.

class CountCharString{
    public static void main(String[] args) {
        String s="java is java";
        int count =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                count ++;
            }
        }
        System.out.println("count of character in the given string : "+ count);
    }

}