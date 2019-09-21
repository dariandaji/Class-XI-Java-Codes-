class The_Loop
{
    public static void main(String args[])
    {
        int p=300,count=1;
        while(true)
        {
            if(p<200)
            break;
            p=p-20;
            count++;
        }
        System.out.println(p+"   "+count);
    }
}