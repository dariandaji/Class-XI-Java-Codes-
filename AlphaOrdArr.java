/*
 * Code to Accept an array of strings and arrange then in alphabetical order. Also print strings beginning with A and Z in the array.
 */

import java.io.*;
public class AlphaOrdArr
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of elements in the array!!!");
        int l=Integer.parseInt(br.readLine());
        String str[]=new String[l];
        String temp="";
        int L = str.length;
        System.out.println("Enter the string elements!!");
        for(int i=0;i<l;i++)
        {
            str[i]=br.readLine();
        }
        for(int i=0;i<L-1;i++)
        {
            for(int j=0;j<(L-1-i);j++)
            {
                if(str[j].compareTo(str[j+1]) >0)
                {
                    temp=str[j+1];
                    str[j+1]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("The elements in alphabetical order are:");
         for(int i=0;i<l;i++)
        {
            System.out.println(str[i]);
        }
        System.out.println("The elements beginning with A or Z are:");
         for(int i=0;i<l;i++)
        {
            if(str[i].charAt(0)=='A' || str[i].charAt(0)=='Z')
            {
                System.out.println(str[i]);
            }
            else
            continue;
        }
    }
}
        