import java.io.*;
public class InsertEle
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of elements in the array!!!");
        int tn=Integer.parseInt(br.readLine());
        int n[]=new int[tn+1];
        System.out.println("Enter "+tn+" numbers");
        for(int i=0;i<tn;i++)
        {
            n[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter element to be inserted!");
        int num=Integer.parseInt(br.readLine());
        System.out.println("Enter the position for the inserted element!");
        int a=Integer.parseInt(br.readLine());
        int prev=0;
        for(int i=0;i<tn;i++)
        {
            if(i==a)
            {
                prev=n[i];
                n[i]=num;
            }
        }
    }
}