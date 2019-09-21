import java.io.*;
public class SwapFunct
{
    public static void Swap(int a,int b)
    {
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers to be swapped");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        System.out.println("Numbers before swapping are :");
        System.out.println(a);
        System.out.println(b);
        System.out.println("Numbers after swapping are :");
        Swap(a,b);
    }
}