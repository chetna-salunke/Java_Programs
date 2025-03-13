// WAJP to identify the avg of a factor of a given number.

 class FactorAvg {
	public static void main(String[] args) {

			int num=6;
			int sum=0;
			int count=0;
			for(int i=1 ; i<=num ; i++)
			{
				if(num%i==0)
				{
					sum=sum+i;
					count++;
				}
				}
				System.out.println(" avg is a factor of" +sum/count);
			}

	}