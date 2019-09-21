import java.io.*;
public class MixedToToggle
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word in MIxed Case");
        String s=br.readLine();
        int l=s.length();
        String s1="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                ch=Character.toLowerCase(ch);
                s1=s1+ch;
            }
            else if(Character.isLowerCase(ch))
            {
                ch=Character.toUpperCase(ch);
                s1=s1+ch;
            }
        }
        System.out.println("The string in Toggle Case is : "+s1);
    }
}