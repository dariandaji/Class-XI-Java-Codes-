import java.io.*;
public class Prog10_5
{
    public static void main(String args[])throws IOException
    {
        double s,comm=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sales");
        s=Double.parseDouble(br.readLine());
        
        if(s>=30001)
        {
            comm=s*0.15;
        }
        else if(s<=30000 && s>=22001)
        {
            comm=s*0.10;
        }
        else if(s<=22000 && s>=12001)
        {
            comm=s*0.07;
        }
        else if(s<=12000 && s>=5001)
        {
            comm=s*0.03;
        }
        else if(s<=5000 && s>=0)
        {
            comm=s*0;
        }
        System.out.println("Your commission is :"+comm);
    }
}