import java.io.*;
public class LeftBelELe
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[][]=new int[5][5];
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
            {
                System.out.println("Enter element at row "+(i+1)+" and column "+(j+1));
                a[i][j]=Integer.parseInt(br.readLine());
            }
            
        System.out.println("The Array is :");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
                System.out.print(a[i][j] +"\t");
            System.out.println();
        }
        System.out.println("Elements in the lower left part of the array are : ");
        for(int i=0;i<5;i++)
        {    
            for(int j=0;j<i;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}