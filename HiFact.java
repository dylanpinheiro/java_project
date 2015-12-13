import java.io.*;
import java.util.*;
class HiFact
{
    Scanner in = new Scanner(System.in);
    int a,b,hcf,lcm;
    HiFact()
    {
        a = b = hcf = 0;
        lcm = 1;
    }
    void getdata()
    {
        System.out.print("Enter value of a : ");
        a = in.nextInt();
        System.out.print("Enter value of b : ");
        b = in.nextInt();
    }
    void change()
    {
        if(a>b)
        {
            int t = a;
            a = b;
            b = t;
        }
    }
    int rechcf(int p,int q)
    {
        if(q==0)
        return p;
        return rechcf(q,p%q);
    }
    int fn_lcm(int a,int b,int hcf)
    {
        if(lcm%a==0 && lcm%b==0 && lcm%hcf==0)
        return lcm;
        lcm++;
        fn_lcm(a,b,hcf);
        return lcm;
    }
    void results()
    {
        System.out.println("HCF = "+rechcf(a,b));
        System.out.println("LCM = "+fn_lcm(a,b,rechcf(a,b)));
    }
    public static void main(String args[])throws IOException
    {
        HiFact ob = new HiFact();
        ob.getdata();
        ob.change();
        ob.results();
    }
}
            
