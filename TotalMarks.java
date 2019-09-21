import java.io.*;
public class TotalMarks
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double marks[]=new double[5];
        System.out.println("Enter the Marks of 5 students");
        for(int i=0;i<5;i++)
        {
            marks[i]=Double.parseDouble(br.readLine());
        }
        System.out.println("The Original Marks of 5 students are :");
        for(int i=0;i<5;i++)
        {
            System.out.println("Marks of student "+(i+1)+" are : "+marks[i]);
        }
        System.out.println("The New Marks of those 5 students are :");
        for(int i=0;i<5;i++)
        {
            System.out.println("Marks of student "+(i+1)+" are : "+(marks[i]+20));
        }
    }
}
        