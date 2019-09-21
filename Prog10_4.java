import java.io.*;
public class Prog10_4
{
    public static void main(String args[])throws IOException
    {
        char ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your character!!");
        ch=(char)(br.read());
        
        if((ch >='A' && ch<='Z') || (ch>= 'a' && ch<='z'))
        System.out.println("You have entered a character");
        else if((ch >='0' &&  ch<='9'))
        System.out.println("You have entered a digit");
        else 
        System.out.println("You have entered a special character");
    }
}