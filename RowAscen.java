import java.io.*;
public class RowAscen
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[][]=new int[4][4];
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
            {
                System.out.println("Enter element at row "+(i+1)+" and column "+(j+1));
                a[i][j]=Integer.parseInt(br.readLine());
            }
            
        System.out.println("The Array is :");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
                System.out.print(a[i][j] +"\t");
            System.out.println();
        }
        int temp=0;
        for(int k=0;k<4;k++)
        {
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<(3-i);j++)
                {
                    if(a[k][j]>a[k][j+1])
                    {
                        temp=a[k][j];
                        a[k][j]=a[k][j+1];
                        a[k][j+1]=temp;
                    }
                }
            }
        }
        
        System.out.println("The New Array is :");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
                System.out.print(a[i][j] +"\t");
            System.out.println();
        }
    }
}
        