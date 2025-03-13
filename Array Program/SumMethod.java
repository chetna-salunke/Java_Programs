//WAJP to define a method which returns sum of elements inan array.

class  SumMethod{
    public static void main(String[] args)
    {
        int a[] ={10,20,30,40};
        int res= sum(a);
        System.out.println("sum of element is" + res);
    }

    public static int  sum(int[]b)
    {
        int sum=0;
        for(int i=0;i<b.length;i++){
            sum+=b[i];
        }
        return sum;
    }
}