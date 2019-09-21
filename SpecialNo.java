import java.io.*;
public class SpecialNo
{
    public static void main(String args[])throws IOException
    {
        int n,fac=0,sum=0,j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no");
        n=Integer.parseInt(br.readLine());
        int num=n;
        do
        {
            fac=1;
            j=n%10;
            for(int i=1;i<=j;i++)
            {    
                fac=fac*i;
            }
            sum=sum+fac;
            n=n/10;
        }
        while(n>0);
        if(sum==num)
        System.out.println("Special No.");
        else
        System.out.println("Not A Special No.");
    }
}