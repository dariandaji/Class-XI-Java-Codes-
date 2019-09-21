import java.io.*;
public class PrintDivisible
{
    public static void main(String args[])throws IOException
    {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter divisor");
        int m=Integer.parseInt(br.readLine());
        
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                if(i%2==0)
                System.out.println("The no. "+n+"is even");
                else
                System.out.println("The no. "+n+"is odd");
            }
        }
    }
}