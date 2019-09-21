import java.io.*;
public class MergeSort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int P[]=new int[6];
        int Q[]=new int[4];
        int R[]=new int[10];
        System.out.println("Enter the first array elements ");
        for(int i=0;i<6;i++)
        {
            P[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the second array elements ");
        for(int i=0;i<4;i++)
        {
            Q[i]=Integer.parseInt(br.readLine());
        }
        int l;
        for(l=0;l<6;l++)
            R[l]=P[l];
            
        for(int i=0;i<4;i++)
        {
            R[l]=Q[i];
            l++;
        }
        System.out.println("The new array is : ");
        for(int i=0;i<10;i++)
            System.out.println(R[i]);
    }
}