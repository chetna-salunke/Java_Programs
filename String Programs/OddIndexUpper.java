//WAJP to convert the odd index character to uppercase.

class OddIndexUpper
{
    public static void main(String[] args){
        String s="volley b all";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i%2!=0 && ch>='a' && ch<='z')
            {
                System.out.print((char)(ch-32));
            }
            else{
                System.out.print(ch);
            }
        }
    }
}