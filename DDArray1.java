public class DDArray1
{
    public static void main (String args[])
    {
        int array[][]=new int[4][4];
        int k=0;
        
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
            {
                array[i][j]=k;
                k++;
            }
            
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
                System.out.print(array[i][j] +"\t");
            System.out.println();
        }
    }
}