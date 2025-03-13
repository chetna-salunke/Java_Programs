// WAJP to sum of a factor of a given number.

 class SumFactor {
	public static void main(String[] args) {
		int num=6;
		int sum=0;
		for(int i=1 ; i<=num ; i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			}
			System.out.println(" sum is a factor of" +sum);
		}
}