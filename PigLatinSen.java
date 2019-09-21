import java.io.*;
public class PigLatinSen
{
    public static void main(String args[])throws IOException
    {
        String s,s1="",s2="",s3="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word");
        s=br.readLine()+' ';
        int l=s.length();
        String a="";
        int j;
        for(int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                a=a+ch;
            }
            else
            {
                int x=a.length();
                for(j=0;j<x;j++)
                {
                    char ch1=(a.charAt(j));
                    if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
                        break;
                    }
                s1=a.substring(0,j);
                s2=a.substring(j,x);
                s3=s2+s1+"ay";
                a="";
            }
        }
            System.out.println("The new String is :"+s3);
    }

}

        


        