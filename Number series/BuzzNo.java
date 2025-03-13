//WAJP to check given no is buzz no. or not.(if any no is ends with or divisible by 7 then we call it as buzz no.)

class  BuzzNo
{
	public static void main(String[] args) 
	{
		int num=7;
		if(num%7==0 ||  num%10==7)
		{
			System.out.println(num+ " Its Buzz No");
		}
		else{
			System.out.println(num + " Its not Buzz No");
		}
	}
}
