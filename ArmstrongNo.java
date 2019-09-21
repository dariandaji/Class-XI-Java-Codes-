import java.io.*;
public class ArmstrongNo
{
    public static void main(String args[])throws IOException
    {
        int n,r=0,sum=0,j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no");
        n=Integer.parseInt(br.readLine());
        int num=n;
        do
        {
            r=n%10;
            sum=(r*r*r)+sum;
            n=n/10;
        }
        while(n>0);
        if(sum==num)
        System.out.println("Armstrong No.");
        else
        System.out.println("Not A Armstrong No.");
    }
}