import java.io.*;
public class Encode
{
    public static void main(String args[])throws IOException
    {
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word");
        s=br.readLine();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            char c;
            if(Character.isUpperCase(ch))
            {
                if(ch=='A' || ch== 'E' || ch=='I' || ch=='O' || ch== 'U' )
                {
                    int ch1=ch+2;
                    c=(char)ch1;
                    s=s.replace(ch,c);
                }
                else 
                {
                    if(ch=='Z')
                    {
                        int p=(int)(ch-25);
                        c=(char)p;
                    }
                    else
                    {
                        int ch1=ch+1;
                        c=(char)ch1;
                    }
                    s=s.replace(ch,c);
                }
            }
            else if(Character.isLowerCase(ch))
            {
                if(ch=='a' || ch== 'e' || ch=='i' || ch=='o' || ch== 'u' )
                {
                    int ch1=ch+2;
                    c=(char)ch1;
                    s=s.replace(ch,c);
                }
                else 
                {
                    if(ch=='z')
                    {
                        int p=(int)(ch-25);
                         c=(char)p;
                    }
                    else
                    {
                        int ch1=ch+1;
                        c=(char)ch1;
                    }
                    s=s.replace(ch,c);
                }
            }
        }
        System.out.println("The new String is : "+s);
    }
}
        