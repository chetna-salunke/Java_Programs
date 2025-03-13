//WAJP to print the element in zigzag.

public class ZigZag
{
    public static void main(String[] args) {
        int a[]= {1,2,3,4};
        int b[]= {6,7,8};
        int c[]= new int[a.length + b.length];

        int aa=0; 
        int bb=0; 
        int cc=0;  

        while(cc<c.length)
        {
            if(aa<a.length)
            {
                c[cc]=a[aa];
                cc++;
                aa++;
            }
            if(bb<b.length)
            {
                c[cc]=b[bb];
                cc++;
                bb++;
            }
        } 
        System.out.println("the zigzag result is ");
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]);
        }     
    }
}