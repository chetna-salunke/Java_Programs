//WAJP to convert  the even index character in to uppercase.

class EvenIndexUpper{
    public static void main(String[] args) {
        String s="Volley b a l l";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i%2==0 && ch>='a' && ch<='z')
            {
                System.out.print((char)(ch-32));
            }
            else{
                System.out.print(ch);
            }
        }
    }
}