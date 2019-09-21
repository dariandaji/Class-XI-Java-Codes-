import java.io.*;
public class Prog10_3
{
    public static void main(String args[])throws IOException
    {
        char c;
        double cel,fah;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter + --- For Addition");
        System.out.println("Enter - --- For Subtraction");
        System.out.println("Enter * --- For Multiplication");
        System.out.println("Enter / --- For Division");
        System.out.println("Enter your choice now!!");
        c=(char)(br.read());
        System.out.println("Enter 2 nos as operands");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        if(c=='+')
        {
            int sum=a+b;
            System.out.println("Sum : "+sum);
        }
        else if(c=='-')
        {
            int diff=a-b;
            System.out.println("Difference : "+diff);
        }
        else if(c=='*')
        {
            int pro=a*b;
            System.out.println("Product : "+pro);
        }
        else if(c=='/')
        {
            int quo=a/b;
            System.out.println("Quotient : "+quo);
        }
        else
        System.out.println("Wrong Input!!!");
    }
}