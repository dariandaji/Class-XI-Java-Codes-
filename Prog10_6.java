import java.io.*;
public class Prog10_6
{
    public static void main(String args[])throws IOException
    {
        char ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your character!!");
        ch=(char)(br.read());
        
        if(Character.isLetter(ch))
        {
            if(Character.isUpperCase(ch))
            System.out.println("You have entered a Uppercase character");
            else if(Character.isLowerCase(ch))
            System.out.println("You have entered a Lower character");
        }
        else if(Character.isDigit(ch))
        System.out.println("You have entered a digit");
        else 
        System.out.println("You have entered a special character");
    }
}