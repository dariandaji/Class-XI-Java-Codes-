class Interest
{
    private double principal;
    private double rate;
    double time;
    double interest;
    Interest()
    {
        principal=10000;
        rate=0.8;
        time=1;
    }
    Interest(double x,double y,double z)
    {
        principal=x;
        rate=y;
        time=z;
    }
    double calInterest()
    {
        interest=(principal*rate*time)/100;
        return interest;
    }
    public double getPrincipal()
    {    
        return principal;
    }
    public double getRate()
    {    
        return rate;
    }
    public double getTime()
    {    
        return time;
    }
        
    public static void main(String args[])
    {
        Interest ob=new Interest();
        Interest ob1=new Interest(25000,0.095,2);
        System.out.println("With Principal : "+ob.getPrincipal());
        System.out.println("With Rate : "+ob.getRate());
        System.out.println("With Time : "+ob.getTime());
        System.out.println("Simple Interest is : "+ob.calInterest());
        System.out.println("With Principal : "+ob1.getPrincipal());
        System.out.println("With Rate : "+ob1.getRate());
        System.out.println("With Time : "+ob1.getTime());
        System.out.println("Simple Interest is : "+ob1.calInterest());
    }
}