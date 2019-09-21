import java.io.*;
public class Shortform
{
    public static void main(String args[])throws IOException
    {
        String s,st="";
        int d=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word");
        s=br.readLine();
        System.out.println("The original String is :"+s);
        System.out.print(s.charAt(0));
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                d+=1;
                if(d==1)
                st=st+"."+(s.charAt(i+1));
                if(d==2)
                st=st+"."+(s.substring(i+1,l));
            }
        }
        System.out.println(st);
    }
}
        