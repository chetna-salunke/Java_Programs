//WAJP to define a method which return the even elementsfrom an array.

class EvenMethod{
    public static void main(String[] args)
    {
        int a[] ={9,20,31, 4,40};
        int res[]= even(a);
        for(int i=0;i<=res.length;i++){
            if(res[i]!=-1)
            {
                  System.out.println("even element are : " + res[i]);
            }
        }
    }

    public static int[]  even (int[]b)
    {
        int c[]=new int[b.length];
        for(int i=0;i<b.length;i++)
        {
            if(b[i]%2==0)
            {
               c[i]=b[i]; 
            }
            else{
                c[i]=-1;
            }
        }
        return c;
    }
}