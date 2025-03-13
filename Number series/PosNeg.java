class PosOrNeg 
{
	public static void main(String[] args) 
	{
		System.out.println(posNeg(28));
	}

	public static String posNeg(int a)
	{
		if(a>0)
		{
			return a + "the number is positive";
		}
		else
		{
		   return a + "the number is negative";
		}
	}
}
