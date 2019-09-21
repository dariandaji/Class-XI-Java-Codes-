import java.io.*;
public class MaxMinArray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of elements in the array!!!");
        int tn=Integer.parseInt(br.readLine());
        int n[]=new int[tn];
        System.out.println("Enter "+tn+" numbers");
        for(int i=0;i<tn;i++)
        {
            n[i]=Integer.parseInt(br.readLine());
        }
        int max=n[0];
        int min=n[0];
        for(int i=0;i<tn;i++)
        {
            if(n[i]>max)
            max=n[i];
            else if(n[i]<min)
            min=n[i];
        }
        System.out.println("Maximum no. : "+max);
        System.out.println("Minimum no. : "+min);
    }
}
        