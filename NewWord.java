import java.io.*;
public class NewWord
{
    public static void main(String args[])throws IOException
    {
        String s,s2="",s3="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word");
        s=br.readLine();
        String s1=br.readLine();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
           char ch=s.charAt(i);
           s3=s3+ch;
           char ch2=s1.charAt(i);
           s3=s3+ch2;
        }
        System.out.println("The new String is : "+s3);
    }
}
        