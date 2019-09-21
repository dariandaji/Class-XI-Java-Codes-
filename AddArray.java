/*
 * Code to add two double dimensional arrays.
 */

public class AddArray
{
    public static void main (String args[])
    {
        int array1[][]={
                             {1 ,2 ,3 },
                             {4 ,5 ,6 },
                             {7 ,8 ,9 }
                            };
        int array2[][]={
                             {11 ,12 ,13 },
                             {14 ,15 ,16 },
                             {17 ,18 ,19 }
                            };                    
        int array3[][]=new int[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            {
                array3[i][j]=array1[i][j]+array2[i][j];
            }
        System.out.println("Output Matrix Is : ");    
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                System.out.print(array3[i][j] +"\t");
            System.out.println();
        }
    }
}