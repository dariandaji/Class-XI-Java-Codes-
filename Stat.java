import java.io.*;
public class Stat
{
    double m,sd;
    int a[]=new int[10];
    
    Stat()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;i++)
            a[i]=Integer.parseInt(br.readLine());
        m=0;
        sd=0;
    }
    
    public double mean()
    {
        int sum=0;
        for(int i=0;i<10;i++)
            sum=sum+a[i];
        m=sum/10;
        return m;
    }
    
    void dev()
    {
        for(int i=0;i<10;i++)
        {
            sd=m-a[i];
            System.out.println("Deviation for "+a[i]+" is : "+sd);
            sd=0;
        }
    }
    
    public static void main(String args[])throws IOException
    {
        Stat obj=new Stat();
        obj.mean();
        obj.dev();
    }
}