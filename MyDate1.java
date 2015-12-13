import java.io.*;
import java.util.*;
class MyDate1
{
    Scanner in = new Scanner(System.in);
    int dd,mm,yy;
    MyDate1()
    {
        dd=0;
        mm=0;
        yy=0;
    }

    void Accept()throws IOException
    {
        System.out.println("Enter the day");
        dd=in.nextInt();
        System.out.println("Enter the month");
        mm=in.nextInt();
        System.out.println("Enter the year");
        yy=in.nextInt();
    }

    int julieanDate(int d,int m)
    {
        int days[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(yy%4==0)
        {
            days[2]=29;
        }
        int dys=0;
        for(int i=1;i<m;i++)
        {
            dys=dys+days[i];
        }
        dys=dys+d;
        return dys;
    }

    void Display()throws IOException
    {
        System.out.println("Juliean Date = "+julieanDate(dd,mm));
    }

    public static void main(String args[])throws IOException
    {
        MyDate1 ob = new MyDate1();
        ob.Accept();
        ob.Display();
    }
