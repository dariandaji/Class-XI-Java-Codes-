import java.io.*;
public class InputIntegerVal
{
    public static void main(String args[])throws IOException
    {
        String s1;
        int numA,numB,numC;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the values for numA nand numB");
        s1=br.readLine();
        numA=Integer.parseInt(s1);
        numB=Integer.parseInt(br.readLine());
        numC=numA * numB;
        System.out.println("The product of the two numbers is : "+numC);
    }
}
        