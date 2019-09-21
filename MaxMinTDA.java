import java.io.*;
public class MaxMinTDA
{
    public static void main (String args[])throws IOException
    {
        int a[][]=new int[4][4];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
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
            
        int max=a[0][0];
        int min=a[0][0];
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
            {
                if(a[i][j] > max)
                {
                      max=a[i][j];
                }              
                else if(a[i][j] < min)
                {
                    min=a[i][j];
                }
            }
        System.out.println(" Highest No. : "+max);
        System.out.println(" Lowest No. : "+min);
        }
    }