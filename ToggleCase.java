import java.io.*;
public class ToggleCase
{
    public static void main(String args[])throws IOException
    {
        String s,s1="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word in Toggle case");
        s=br.readLine();
        char ch1;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
           char ch=s.charAt(i);
           if (Character.isLowerCase(ch))
           {
               ch1=Character.toUpperCase(ch);
               s1=s1+ch1;
           }
           if (Character.isUpperCase(ch))
           {
               ch1=Character.toLowerCase(ch);
               s1=s1+ch1;
           }
           if (Character.isWhitespace(ch))
           {
               s1=s1+" ";
           }
        }
        System.out.println("The new String is : "+s1);
    }
}
        