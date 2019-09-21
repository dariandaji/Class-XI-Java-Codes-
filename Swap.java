import java.io.*;
public class Swap
{
    public static void main(String args[])throws IOException
    {
        int a,b;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the values for a and b");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
        