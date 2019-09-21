import java.io.*;
public class SwapTEmp
{
    public static void main(String args[])throws IOException
    {
        int a,b;
        int temp;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the values for a and b");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        temp=a;
        a=b;
        b=temp;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
        