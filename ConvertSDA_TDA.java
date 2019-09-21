import java.io.*;
public class ConvertSDA_TDA
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int l,j;
        System.out.println("Enter the limit");
        l=Integer.parseInt(br.readLine());
        int a[]=new int[l];
        for(int i=0;i<l;i++)
        {
                System.out.println("Enter element at position "+(i+1));
                a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("The Array is :");
        for(int i=0;i<l;i++)
        {
            System.out.print(a[i]+" \t ");
            System.out.println();
        }
            
        int b[][]=new int [l][l];
        for(int i=0;i<l;i++)
        {
            for(j=0;j<=i;j++)
            {
                b[i][j]=a[j];
            }
            while(j<l)
            {
                b[i][j]=0;
                j++;
            }
        }
        System.out.println("The 2D Array is : ");
         for(int i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
                System.out.print(b[i][j] +"\t");
            System.out.println();
        }
        }
    }