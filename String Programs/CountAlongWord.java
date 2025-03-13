//WAJP to print the no .of character of each word along with the word.

class CountAlongWord{
    public static void main(String[] args) {

        String s ="java is   java okk";
        String [] s1 =s.split(" ");

        for (int i=0;i<s1.length;i++)
        {
          if(s1[i].length()>0)
          {
            System.out.println(s1[i]+" "  + s1[i].length());
          }
        }
    }
}