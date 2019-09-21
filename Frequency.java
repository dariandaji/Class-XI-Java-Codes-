import java.io.*;
public class Frequency
{
    public static void main(String args[])throws IOException
    {
        String s,s1,t="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word");
        s=br.readLine();
        s=s.trim()+' ';
        System.out.println("enter the word to be searched in "+s);
        s1=br.readLine();
        int l=s.length();
        int f=0;
        for(int z=0;z<l;z++)
        {
            char ch = s.charAt(z);
            if(ch!=' ')
            t=t+ch;
            else
            {
                if(t.equalsIgnoreCase(s1))
                f=f+1;
                t="";
            }
        }
        System.out.println("The frequency of "+s1+" is "+f);
    }
}