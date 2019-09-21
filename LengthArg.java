import java.io.*;
public class LengthArg
{
    public static void main(String args[])throws IOException
    {
        String s,s1="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word");
        s=br.readLine();
        if(s.endsWith(".") ||s.endsWith(",") ||s.endsWith("?") ||s.endsWith("!"))
        {
            int l=s.length();
            for(int i=0;i<=l;i++)
            {
                char ch=s.charAt(i);
                if(Character.isWhitespace(ch))
                {
                    s1=s1+ch;
                    int len=s.length()-1;
                    continue;
                }
                
                
            }
        }
        
    }
}
            