import java.io.*;
public class RecursivePower
{
    public static int power(int x,int n)
    {
        if(n==0)
        return 1;
        else
        return (x*power(x,n-1));
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of x.");
        int x=Integer.parseInt(br.readLine());
        System.out.println("Enter the value of n.");
        int n=Integer.parseInt(br.readLine());
        System.out.println("The value of x^n is = "+power(x,n));
    }
}