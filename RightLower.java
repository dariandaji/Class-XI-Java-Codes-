import java.io.*;
public class RightLower
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter element at row "+(i+1)+" and column "+(j+1));
                a[i][j]=Integer.parseInt(br.readLine());
            }
            
        System.out.println("The Array is :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                System.out.print(a[i][j] +"\t");
            System.out.println();
        }
        int k=2;
        System.out.println("Elements in the lower right part of the array are : ");
        for(int i=0;i<3;i++)
        {    
            for(int j=0;j<3;j++)
            {
                while(j<k)
                {
                    System.out.print(" "+"\t");
                    j++;
                }
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
            k--;
        }
    }
}