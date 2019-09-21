import java.io.*;
public class Temperature
{
    public static void main(String args[])throws IOException
    {
        double c,f;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the temperature in celcius");
        c=Double.parseDouble(br.readLine());
        f=(c*1.8)+ 32;
        System.out.println("Temperature in Fahrenheit : "+f);
    }
}
        