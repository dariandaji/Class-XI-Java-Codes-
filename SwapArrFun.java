import java.io.*;
public class SwapArrFun
{ 
    static void SwapArr(int a[])
    {
        int temp=0;
        for(int i=0;i<10;i+=2)
        {
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
            temp=0;
        }
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[10];
        System.out.println("Enter the numbers!!");
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        SwapArr(a);
        System.out.println("The new array is : ");
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}