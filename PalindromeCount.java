import java.io.*;
public class PalindromeCount
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word ");
        String s=br.readLine();
        int l=s.length();
        String s1="";
        int count=0;
        for(int i=l-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            s1=s1+ch;
            System.out.print(ch);
        }
        System.out.println();
        for(int i=0;i<l;i++)
        {
            char a=s.charAt(i);
            char b=s1.charAt(i);
            if(a==b)
                continue;
            else
                count++;
        }
        System.out.println("No. of characters which differ to make palindrome word = "+count);
    }
}