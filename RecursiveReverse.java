import java.io.*;
public class RecursiveReverse
{
    public static int rev(int n,int r)
    {
        if(n==0)
        return r;
        else
        {
            r=r*10+n%10;
            return rev(n/10,r);
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number to be reversed");
        int n=Integer.parseInt(br.readLine());
        int r=rev(n,0);
        System.out.println("The number after reversing the digits is = "+r);
    }
}