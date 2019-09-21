import java.io.*;
public class RightLeft0
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[][]=new int[4][4];
        int k=2;
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
        
        for(int i=0;i<4;i++)
            for(int j=i;j<4;j++)
            {
                if(j==i)
                a[i][j]=0;
            }
            
        int j=3;
        for(int i=0;i<4;i++)
        {
            a[i][j]=0;
            j--;
        }
        
        System.out.println("The New Array is :");
        for(int i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
                System.out.print(a[i][j] +"\t");
            System.out.println();
        }
    }
}
        