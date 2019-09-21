public class InsertionSort
{
    public static void main(String args[])
    {
        int N[]={90,40,60,80,20,30};
        for(int i=1;i<N.length;i++)
        {
            int key=N[i];
            int position=i;
            while(position>0 && N[position-1]>key)
            {
                N[position]=N[position-1];
                position--;
            }
            N[position]=key;
        }
        System.out.println("The Sorted Array is: ");
        for(int i=0;i<N.length;i++)
            System.out.println(N[i]);
    }
}