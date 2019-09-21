import java.io.*;
public class RecursiveGCD
{
    int r=0,r1=0;
    public int GCD(int x,int y)
    {
        while(r==0)
        {
            if(x%y==0)
                return y;
            else if(y%x==0)
                return x;
            else if(x>y)
            {
                r=x%y;
                r1=y/x;
            }
            
            else if(y>x)
            {
                r=y%x;
                r1=x/y;
            }
            
            y=x;
            x=r;
            r=GCD(x,y);
        }
        return r;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        RecursiveGCD ob=new RecursiveGCD();
        System.out.println("Enter the first no. to find GCD");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter the second no. to find GCD");
        int b=Integer.parseInt(br.readLine());
        System.out.println("The GCD = "+ob.GCD(a,b));
    }
}