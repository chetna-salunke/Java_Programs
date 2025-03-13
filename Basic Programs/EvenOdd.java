import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) {
		Scanner s= new  Scanner(System.in);
		System.out.println("Enetr the number to check if its odd or even");
		int n= s.nextInt();
		if(n%2==0)
		{
			System.out.println("given number is even " +n);
		}
		else 
		{
			System.out.println("given number is odd "+ n);
		}
		
	}

}
