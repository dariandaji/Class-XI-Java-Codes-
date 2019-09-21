import java.io.*;
public class SelectionSort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of elements in the array!!!");
        int N=Integer.parseInt(br.readLine());
        int R[]=new int[N];
        int lowest,loc,T;
        System.out.println("Enter the numbers!!");
        for(int i=0;i<N;i++)
        {
            R[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<N-1;i++)
        {
            lowest=R[i];
            loc=i;
            for(int j=i+1;j<N;j++)
            {
                if(lowest>R[j])
                {
                    loc=j;
                    lowest=R[j];
                }
            }
            T=R[i];
            R[i]=R[loc];
            R[loc]=T;
        }
        System.out.println("The elements in ascending order are:");
         for(int i=0;i<N;i++)
        {
            System.out.println(R[i]);
        }
    }
}
        