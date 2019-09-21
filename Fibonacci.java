public class Fibonacci
{
    public static void main(String args[])
    {
        int a=0,b=1,d=0;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<=10;i++)
        {
            d=a+b;
            System.out.print(d+" ");
            a=b;
            b=d;
        }
    }
}