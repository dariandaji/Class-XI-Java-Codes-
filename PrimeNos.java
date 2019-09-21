import java.io.*;
public class PrimeNos
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of elements in the array!!!");
        int tn=Integer.parseInt(br.readLine());
        int n[]=new int[tn];
        int flag,sum=0;
        System.out.println("Enter "+tn+" numbers");
        for(int i=0;i<tn;i++)
        {
            n[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<tn;i++)
        {
            flag=0;
            for(int j=2;j<n[i];j++)
            {
                if(n[i]%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("The Prime elements are : "+n[i]+" ");
                sum=sum+n[i];
            }
        }
        System.out.println("Sum of Prime Nos. is : "+sum);
    }
}