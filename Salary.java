import java.io.*;
public class Salary
{
    String name,address,phone,SubSp;
    double MSal,ITx;
    
    void Accept()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Name of Teacher : ");
        name=br.readLine();
        System.out.println(" Address of Teacher : ");
        address=br.readLine();
        System.out.println(" Phone no. of Teacher : ");
        phone=br.readLine();
        System.out.println(" Subject Specialisation of Teacher : ");
        SubSp=br.readLine();
        System.out.println(" Monthly Salary of the teacher : ");
        MSal=Double.parseDouble(br.readLine());
    }
    
    void display()
    {
        System.out.println("Name \t\t  Address \t\t  Phone No. \t\t  Subject \t\t Monthly Salary \t IncomeTax");
        System.out.println(name+" \t\t "+address+"\t\t"+phone+"\t\t"+SubSp+" \t\t "+MSal+"\t\t\t"+ ITx);
    }
    
    void compute()
    {
        if(MSal>200000)
        {
            ITx=0.05*(MSal-200000);
        }
        else
        ITx=0;
    }
    public static void main(String args[])throws IOException
    {
        Salary obj=new Salary();
        obj.Accept();
        obj.compute();
        obj.display();
    }
}