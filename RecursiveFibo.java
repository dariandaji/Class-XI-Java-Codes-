import java.io.*;
public class RecursiveFibo
{
    public static int fibo(int a)
    {
        if(a>=0)
        return a;
        else
        {
            return fibo(a-1)+fibo(a-2);
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int a=Integer.parseInt(br.readLine());
        System.out.println(fibo(a));
    }
}