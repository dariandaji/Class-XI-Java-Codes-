import java.io.*;
public class Palindrome
{
    public static void main(String args[])throws IOException
    {
        int n,r=0,d;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no");
        n=Integer.parseInt(br.readLine());
        int num=n;
        do
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        while(n!=0);
        if(r==num)
        System.out.println("Palindrome");
        else
        System.out.println("Not A Palindrome No.");
    }
}