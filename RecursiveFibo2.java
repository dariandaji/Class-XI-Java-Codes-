import java.io.*;
public class RecursiveFibo2
{
    public static int fibo(int n)
    {
        if(n==0)
        return 0;
        else if(n==1)
        return 1;
        else
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<=n;i++)
            System.out.print(fibo(i)+" ");
    }
}