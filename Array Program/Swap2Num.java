//WAJP to Swap the numbers

class Swap2Num 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int temp;
		System.out.println("before swapping a: "+ a+ " b:"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping a: " +a+" b:"+b);
	}
}