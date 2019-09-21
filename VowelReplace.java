import java.io.*;
public class VowelReplace
{
    public static void main(String args[])throws IOException
    {
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word");
        s=br.readLine();
        System.out.println("The original String is :"+s);
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            if(ch=='a' || ch== 'e' || ch=='i' || ch=='o' || ch== 'u')
            {
                s=s.replace(ch,'*');
            }
            else 
            continue;
        }
        System.out.println("The new String is :"+s);
    }
}
        