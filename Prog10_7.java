import java.io.*;
public class Prog10_7
{
    public static void main(String args[])throws IOException
    {
        double a,b,c,d=0,r1,r2;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a");
        a=Double.parseDouble(br.readLine());
        System.out.println("Enter b");
        b=Double.parseDouble(br.readLine());
        System.out.println("Enter c");
        c=Double.parseDouble(br.readLine());
        if(a==0)
        System.out.println("Value of a cannot be zero");
        else 
        {
            d=b*b-4*a*c;
            if(d>0)
            {
                r1=(-b+Math.sqrt(d))/(2*a);
                r2=(-b-Math.sqrt(d))/(2*a);
                System.out.println("The roots are real and Unequal");
                System.out.println("Root1 : "+r1+" Root2 : "+r2);
            }
            else if(d==0)
            {
                r1=-b/(2*a);
                r2=r1;
                System.out.println("The roots are real and equal");
                System.out.println("Root1 : "+r1+" Root2 : "+r2);
            }
            else
            System.out.println("The roots are complex and imaginary");
        }
    }
}