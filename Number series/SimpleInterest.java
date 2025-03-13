class SimpleInterest 
{
	public static void main(String[] args) 
	{
		double principle=335;
		double rate=2.9;
		int time=12;
		double si=SI(335,2.9,12);
		System.out.println("Interset Amount is: " +si);
	}
	public static double SI(double principle, double rate, int time)
	{
		return principle*rate*time/100;
	}
}
 