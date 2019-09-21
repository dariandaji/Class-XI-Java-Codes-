import java.io.*;
public class ReverseString
{
    public static void main(String args[])throws IOException
    {
        String s,s1="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word");
        s=br.readLine()+" ";
        int l=s.length();
        int b=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                
                for(int j=i-1;j>=b;j--)
                {
                    char c=s.charAt(j);
                    s1=s1+c;
                }
                b=i;
                System.out.print(s1+" ");
                s1="";
            }
        }
    }
}