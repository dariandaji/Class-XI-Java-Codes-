import java.io.*;
public class Prog10_1
{
    public static void main(String args[])throws IOException
    {
        int a,b,c;
        int max=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the three nos.");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        if(a>b && a>c)
        max=a;
        else if (b>a && b>c)
        max=b;
        else
        max=c;
        System.out.println("The largest no. is "+max);
    }
}