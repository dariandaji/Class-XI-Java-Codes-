import java.io.*;
public class RecursiveFact
{
    public static int fact(int a)
    {
        if(a==1)
        return 1;
        else
        {
            int f=a*(fact(a-1));
            return f;
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int a=Integer.parseInt(br.readLine());
        System.out.println("The factorial of "+a+" is : "+fact(a));
    }
}