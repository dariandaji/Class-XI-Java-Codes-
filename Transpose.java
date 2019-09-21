import java.io.*;
public class Transpose
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of rows ");
        int r =Integer.parseInt(br.readLine());
        System.out.println("Enter the no. of columns ");
        int c =Integer.parseInt(br.readLine());
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            {
                System.out.println("Enter element at row "+(i+1)+" and column "+(j+1));
                a[i][j]=Integer.parseInt(br.readLine());
            }
            
        System.out.println("The Array is :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print(a[i][j] +"\t");
            System.out.println();
        }
        int temp=0;
        if(r==c)
        {
            for(int i=0;i<r;i++)
                for(int j=i;j<r;j++)
                {
                    temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            System.out.println(" The Transpose array is :");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<r;j++)
                    System.out.print(a[i][j] +"\t");
                System.out.println();
            }
        }
        else
            System.out.println("INvalid");
        }
    }