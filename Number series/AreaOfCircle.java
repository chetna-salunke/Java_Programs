class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		int radius=5;
		double area=areaofCircle(radius);
		System.out.println("Area of circle " +area);
	}
	public static double areaofCircle(int radius)
	{
		double pi=3.14;
		return pi*radius*radius;
	}
}
