// WAJP to sum of a factor of a given number.

class FactorNo {
	public static void main(String[] args) {
		int num=8;
		int a=1;
		while(a<=num) 
		{
			if(num%a==0)
			{
				System.out.println(a+" is a factor of" +num);
			}
			a++;
		}
	}

}