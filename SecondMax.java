import java.io.*;
public class SecondMax
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int mat[]=new int[4];
        int max,max2;
        System.out.println("Enter 4 numbers");
        for(int i=0;i<4;i++)
        {
            mat[i]=Integer.parseInt(br.readLine());
        }
        max=mat[0];
        max2=mat[0];
        for(int i=0;i<4;i++)
        {
            if(mat[i]>max)
                max=mat[i];
        }
        for(int i=0;i<4;i++)
        {
            if(mat[i]<max && mat[i]>max2)
                max2=mat[i];
        }
        System.out.println("Second Maximum Number : "+max2);
    }
}
        