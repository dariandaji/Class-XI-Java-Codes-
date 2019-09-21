import java.io.*;
public class BinarySearch
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of elements in the array!!!");
        int tn=Integer.parseInt(br.readLine());
        int n[]=new int[tn];
        
        int find=-1,first,last,mid;
        
        System.out.println("Enter "+tn+" numbers");
        for(int i=0;i<tn;i++)
        {
            n[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter element to be searched!");
        int num=Integer.parseInt(br.readLine());
        
        first=0;
        last=tn-1;
        while((first<=last) && (find==-1))
        {
            mid=(first+last)/2;
            if(n[mid]==num)
                find=mid;
            else
                if(n[mid]<num)
                    first = mid +1;
                else
                    last = mid-1;
        }
        if(find > -1)
            System.out.println(" The number "+num+" is at position "+find+" in the array");
        else
            System.out.println("No. does not exist");
    }
}