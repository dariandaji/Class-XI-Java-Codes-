import java.io.*;
public class NameSearch
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name[]=new String[10];
        int count =0;
        System.out.println("Enter 10 names : ");
        for(int i=0;i<10;i++)
        {
            name[i]=br.readLine();
        }
        System.out.println("Enter the first character of the name!!");
        char ch=(char)br.read();
        ch=Character.toUpperCase(ch);
        for(int i=0;i<10;i++)
        {
            char c=name[i].charAt(0);
            if(ch==c)
            {
                count++;
                System.out.println(" Name "+name[i]+" starts with "+ch);
            }
            else
            continue;
        }
        if(count==0)
            System.out.println("Name not present ");
        }
    }