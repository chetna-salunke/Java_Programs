//WAJP to convert the given string  into uppercase without using builtin method.

class Uppercase{
    public static void main(String[] args) 
	{
        String s="programming";
        for(int i=0;i<s.length();i++){
            int res=(s.charAt(i)-32);
            System.out.print((char)res);
        }

    }

}