//WAJP to convert each word initial letter to uppercase.

class InitialUppercase{
    public static void main(String[] args) {
        String s="sql is my favourite subject";
        String s1[]=s.split(" ");
        String s2=" ";
        for(int i=0;i<s1.length;i++)
        {
            char ch[]=s1[i].toCharArray();
            for(int j=0;j<ch.length;j++)
            {
                if(j==0 && ch[j]>'a' && ch[j]<='z')
                {
                    s2=s2+(char)(ch[j]-32);
                }
                else{
                    s2=s2+ch[j];
                }
            }
            s2=s2+" ";
        }
        System.out.println(s2);
    }
}

/*
String s="java is a java";
    char ch[]=s.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
        if(i==0 && ch[i]!=' ')
        {
           ch[i]=(char)(ch[i]-32);
        }
        if(ch[i]==' ' && ch[i+1]!=' ')
        {
           ch[i+1]=(char)(ch[i+1]-32);
        }

    }
    for(int i=0;i<ch.length;i++)
    {
        System.out.print(ch[i]);
    }
 */   