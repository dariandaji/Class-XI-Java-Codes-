import java.io.*;
public class PeriAreaRec
{
    public static void main(String args[])throws IOException
    {
        int l,b,area,peri;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the values for length and breadth");
        l=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        area=l*b;
        peri=2*(l+b);
        System.out.println("area : "+area);
        System.out.println("perimeter : "+peri);
    }
}
        