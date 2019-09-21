import java.io.*;
public class Buzz
{
    public static void main(String args[])throws IOException
    {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no");
        n=Integer.parseInt(br.readLine());
        
        if(n%7==0 || n%10==7)
        System.out.println("Buzz NO.");
        else
        System.out.println("Not a Buzz No.");
    }
}