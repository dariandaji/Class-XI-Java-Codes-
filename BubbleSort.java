import java.io.*;
public class BubbleSort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of elements in the array!!!");
        int l=Integer.parseInt(br.readLine());
        int n[]=new int[l];
        int temp=0;
        int L = n.length;
        System.out.println("Enter the numbers!!");
        for(int i=0;i<l;i++)
        {
            n[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<L-1;i++)
        {
            for(int j=0;j<(L-1-i);j++)
            {
                if(n[j]>n[j+1])
                {
                    temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        System.out.println("The elements in ascending order are:");
         for(int i=0;i<l;i++)
        {
            System.out.println(n[i]);
        }
    }
}
        