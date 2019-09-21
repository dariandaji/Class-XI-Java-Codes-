import java.io.*;
public class SumArray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num[]=new int[5];
        int sum=0;
        System.out.println("Enter the numbers");
        for(int i=0;i<5;i++)
        {
            num[i]=Integer.parseInt(br.readLine());
            sum=sum+num[i];
        }
        System.out.println("The sum of the numbers entered is "+sum);
    }
}
        