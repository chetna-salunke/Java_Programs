class AddNo 
{
	//addition of no
	public static void main(String[] args) 
	{
		int n=13;
		int num=1;
		int sum=0;
		while(n>0)
		{
			sum=sum+num;
			num++;
			n--;
		}
		System.out.println(sum);//91
	}
}
