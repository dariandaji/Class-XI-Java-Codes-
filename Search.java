import java.io.*;
public class Search
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of elements in the array!!!");
        int tn=Integer.parseInt(br.readLine());
        int n[]=new int[tn];
        System.out.println("Enter "+tn+" numbers");
        for(int i=0;i<tn;i++)
        {
            n[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter element to be searched!");
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<tn;i++)
        {
            if(n[i]==num)
            {
                System.out.println("The position of "+num+" in the array is : "+(i+1));
                break;
            }
        }
    }
}