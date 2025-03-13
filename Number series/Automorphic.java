//WAJP to check given no is Automorphic or not. (square of last digit will be equals to given no.)

class  Automorphic
{
	public static void main(String[] args) 
	{
		int num=25;
		int num1=num*num;
		boolean flag=true;
		while(num!=0)
		{
			if(num%10==num1%10)
			{
				num=num/10;
				num1=num1/10;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
		   System.out.println("It's Automorphic");
	    }
		else{
			System.out.println("Not Automorphic");
		}
	}
}

