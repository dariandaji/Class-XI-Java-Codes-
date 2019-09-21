import java.io.*;
public class Series
{
    public static void main(String args[])throws IOException
    {
        String s,s1="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word");
        s=br.readLine()+" ";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                for(int j=i;j<i;j--)
                {
                    char c=s.charAt(j);
                    s1=s1+c;
                }
            }
        }
        System.out.println(s1);
    }
}