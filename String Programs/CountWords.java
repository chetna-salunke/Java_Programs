//WAJP to count the words present in given string.

class CountWords{
    public static void main(String[] args) {
        String s=" java is java ok";
        int count=1;
        if(s.charAt(0)==' ')
        {
            count=0;
        }
        for(int i=0;i<s.length();i++)
        {
               if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
               {
                count++;
               }
        }
        System.out.println("the count of word is: "+ count);
    }
}