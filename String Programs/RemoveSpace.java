//WAJP to remove the spaces from the given String.


class RemoveSpace{
    public static void main (String[] args){
        String s= "java is programming langugae";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
              System.out.print(s.charAt(i));
            }
        }
    }
}

//using built in ()--> s.replace(" ","")