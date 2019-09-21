import java.io.*;
public class Calculator2
{
    public static void main(String args[])throws IOException
    {
        char c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter + ---------Add");
        System.out.println("Enter - ---------Subtract");
        System.out.println("Enter * ---------Multiply");
        System.out.println("Enter / ---------Divide");
        System.out.println("Enter % ---------Modulus");
        System.out.println("Enter Your Choice now");
        c=(char)br.read();
        
        System.out.println("Enter two nos.");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        switch(c)
        {
             case'+':
             System.out.println("Sum : "+(a+b));
             break;
             case '-':
             System.out.println("Difference : "+(a-b));
             break;
             case '*':
             System.out.println("Product : "+(a*b));
             break;
             case '/':
             System.out.println("Quotient : "+(a/b));
             break;
             case '%':
             System.out.println("Modulus : "+(a%b));
             break;
             default:System.out.println("Wrong Input!!");
            }
        }
    }