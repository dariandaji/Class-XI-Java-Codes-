import java.io.*;
public class Prog10_2
{
    public static void main(String args[])throws IOException
    {
        int c;
        double cel,fah;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 ---------------------- To convert temperature from Celcius to Fahrenheit");
        System.out.println("Enter any other no. than 1 --- To convert temperature from Fahrenheit to Celcius");
        System.out.println("Enter your choice now!!");
        c=Integer.parseInt(br.readLine());
        
        if(c==1)
        {
            System.out.println("Enter temperature in Celcius");
            cel=Double.parseDouble(br.readLine());
            fah=(cel*1.8)+32;
            System.out.println("Temperature in Fahrenheit : "+fah);
        }
        else if(c!=1)
        {
            System.out.println("Enter temperature in Fahrenheit");
            fah=Double.parseDouble(br.readLine());
            cel=(fah-32)/1.8;
            System.out.println("Temperature in Celcius : "+cel);
        }
    }
}