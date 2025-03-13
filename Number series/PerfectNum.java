// WAJP to check whether the given number is a perfect number or not.

 class PerfectNum {
	public static void main(String[] args) {
		int a=6;
		int sum= 0;
		for(int i=1 ;i<a ;i++) 
		{
			if(a%i==0)
			sum=sum+i;
		}
		if(a==sum)
		{
		    System.out.println(a+" is a Perfect Number");
		}
		else
		{
			System.out.println(a+" is  not a Perfect Number");
		}
	}
}