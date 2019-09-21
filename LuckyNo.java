import java.io.*;
public class LuckyNo
{
    public static void main(String args[])throws IOException
    {
        int n,s,rem=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no");
        n=Integer.parseInt(br.readLine());
        s=n;
        while(s>9)
        {
            n=s;
            s=0;
            while(n>0)
            {
                rem=n%10;
                s=s+rem;
                n=n/10;
            }
        }
        if(s==1)
        System.out.println("Yes..it is a Lucky No.");
        else
        System.out.println("Not A Lucky No.");
    }
}