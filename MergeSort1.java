import java.io.*;
public class MergeSort1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the no. of elements in the 1st array!!!");
        int M=Integer.parseInt(br.readLine());
        int R1[]=new int[M];
        
        System.out.println("Enter the no. of elements in the 2nd array!!!");
        int N=Integer.parseInt(br.readLine());
        int R2[]=new int[N];
        
        int R3[]=new int[M+N];
        int i,j,k;
        System.out.println("Enter the elements of the first array!! ");
        for(i=0;i<M;i++)
        {
            R1[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the elements of the second array!!  ");
        for(j=0;j<N;j++)
        {
            R2[j]=Integer.parseInt(br.readLine());
        }
        
        i=0;
        j=0;
        k=0;
        while((i<M) && (j<N))
        {
            if(R1[i]<R2[j])
            {
                R3[k]=R1[i];
                k=k+1;
                i=i+1;
            }
            else
            {
                R3[k]=R2[j];
                k=k+1;
                j=j+1;
            }
        }
        while(i<M)
        {
            R3[k]=R1[i];
            k=k+1;
            i=i+1;
        }
        while(j<N)
        {
            R3[k]=R2[j];
            k=k+1;
            j=j+1;
        }
        System.out.println("The array is : ");
        for(k=0;k<(M+N);k++)
            System.out.println(R3[k]);
    }
}