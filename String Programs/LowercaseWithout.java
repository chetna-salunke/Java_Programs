//WAJP to convert the given string into lowercase without using built in method.

class LowercaseWithout{
    public static void main(String[] args) 
	{
        String s="JAVA";
        for(int i=0;i<s.length();i++){
            int res=(s.charAt(i)+32);
            System.out.print((char)res);
        }

    }
}