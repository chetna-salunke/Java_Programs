//WAJP to print the reverse string

public class ReverseString 
{
	public static void main(String[] args) 
	{
		//Output: Namade Cup Sala E
		String s = "E Sala Cup Namade";
		String[] s1 = s.split(" ");

		for(int i=s1.length-1; i>=0; i--) 
		{
			System.out.print(s1[i]+" ");
		}

		//Output: edamaN puC alaS E
	    System.out.println();
        String s2 = " E Sala Cup Namade";
        for(int i=s2.length()-1; i>=0; i--) 
		{
    	   System.out.print(s2.charAt(i));
        }
        System.out.println();

        //Output: E alaS puC edamaN
        String s3 = "E Sala Cup Namade";
        String[] s4 = s3.split(" ");
        String s5 = "";
        for(int i=0; i<s4.length; i++) 
		{
        	s5 = s4[i];
        	StringBuilder s6 = new StringBuilder(s5);
        	System.out.print(s6.reverse()+" ");
	   }
	}

}