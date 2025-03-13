//WAJP will check the given no. It is Armstrong no.(sum of power of each digit based on the count  will be equals to the given no. then its Armstrong no)

class  Armstrong
{
	public static void main(String[] args) 
	{
		int num=153;
		int num1=num;
		int num2=num1;
		int count=0;
		int sum=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		//below while loop i sto get sum of each digit power of count
		while(num1!=0)
		{
			int rem=num1%10;  //3//5//1
			int power=1; 
      //below for loop is to multiply th enumber based on count
			for(int i=1;i<=count;i++)
			{
				power=power*rem; //9//25//1
			}
			sum=sum+power; 
			num1=num1/10;

		}
	
		if(sum== num2)
		{

			System.out.println("Is Armstrong number");
		}
		else{
			System.out.println("Not Armstrong number");
		}
	}
}
