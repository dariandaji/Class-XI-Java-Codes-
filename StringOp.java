import java.io.*;
public class StringOp
{
    static String str;
    
    StringOp()
    {
        str="";
    }
    
    void Encode()
    {
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch=='y')
            {
                char c='a';
                str=str.replace(ch,c);
            }
            if(ch=='Y')
            {
                char c='A';
                str=str.replace(ch,c);
            }
            if(ch=='Z')
            {
                char c='B';
                str=str.replace(ch,c);
            }
            if(ch=='z')
            {
                char c='b';
                str=str.replace(ch,c);
            }
            if(ch!=' ')
            {
                int c1=ch+2;
                char c=(char)c1;
                str=str.replace(ch,c);
            }
        }
    }
    
    void print()
    {
        System.out.println(str);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        str=br.readLine();
        StringOp obj=new StringOp();
        obj.Encode();
        obj.print();
    }
}