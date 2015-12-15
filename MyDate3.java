import java.io.*;
import java.util.*;
class MyDate3
{
    Scanner in = new Scanner(System.in);
    int dd,mm,yy;
    MyDate3()
    {
        dd = mm = yy = 0;
    }

    void Accept()
    {
        System.out.println("Enter the date : (dd-mm-yyyy)");
        String st = in.nextLine();
        dd=Integer.parseInt(st.substring(0,2));
        mm=Integer.parseInt(st.substring(3,5));
        yy=Integer.parseInt(st.substring(6));
    }

    void Output1()throws IOException
    {
        int k = 0;
        String month[]={ "", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };
        int maxdays[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int nos[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        String no_w[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String tens[] = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String out1 = "",out2 = "";
        if(Integer.toString(dd).length() < 2)
        {
            out1 = out1 + no_w[Integer.parseInt((Integer.toString(dd).charAt(0))+"")]+" - ";
        }
        if(Integer.toString(dd).charAt(0) == '1' && Integer.toString(dd).length() == 2)
        {
            out1 = out1 + no_w[Integer.parseInt(((Integer.toString(dd).charAt(0))+"")+((Integer.toString(dd).charAt(1))+""))]+" - ";
        }
        if(Integer.toString(dd).charAt(0) == '2' && Integer.toString(dd).length() == 2)
        {
            if(Integer.toString(dd).charAt(1) == '0')
            {
                out1 = out1 + "Twenty ";
                k = 1;
            }
            if(Integer.toString(dd).charAt(1) != '0')
            {
                out1 = out1 + "Twenty ";
                out1 = out1 + no_w[Integer.parseInt((Integer.toString(dd).charAt(1))+"")]+" - ";
                k = 1;
            }
        }
        if(Integer.toString(dd).charAt(0) == '3' && Integer.toString(dd).length() == 2)
        {
            if(Integer.toString(dd).charAt(1) == '0')
            {
                out1 = out1 + "Thirty ";
                k = 1;
            }
            if(Integer.toString(dd).charAt(1) != '0')
            {
                out1 = out1 + "Thirty ";
                out1 = out1 + no_w[Integer.parseInt((Integer.toString(dd).charAt(1))+"")]+" - ";
                k = 1;
            }
        }
        out1 = out1 + no_w[Integer.parseInt(Integer.toString(mm))]+" - ";
        out1 = out1 + no_w[Integer.parseInt(Integer.toString(yy).charAt(0)+"")]+" ";
        if(Integer.toString(yy).length() == 4)
        {
            out1 = out1 + "Thousand ";
        }
        if(Integer.parseInt(Integer.toString(yy).charAt(1)+"" ) > 0)
        {
            out1 = out1 + no_w[Integer.parseInt(Integer.toString(yy).charAt(1)+"")]+" Hundered ";
        }
        out1 = out1 + "and ";
        if(Integer.parseInt(((Integer.toString(yy).charAt(2))+"")+((Integer.toString(yy).charAt(3))+"")) < 19)
        {
            out1 = out1 + no_w[Integer.parseInt(((Integer.toString(yy).charAt(2))+"")+((Integer.toString(yy).charAt(3))+""))];
        }
        if(Integer.parseInt(((Integer.toString(yy).charAt(2))+"")+((Integer.toString(yy).charAt(3))+"")) > 19)
        {
            out1 = out1 + tens[Integer.parseInt(Integer.toString(yy).charAt(2)+"")]+" ";
            out1 = out1 + no_w[Integer.parseInt(Integer.toString(yy).charAt(3)+"")];
        }
        System.out.println("Output 1 : "+out1);
    }

    void Output2()throws IOException
    {
        String suffix[] = {"","st","nd","rd","th","th","th","th","th","th","th"};
        String mon[] = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
        String out2 = "";
        try {
            if(Integer.toString(dd).charAt(1) == '0' && Integer.toString(dd).length() > 1)
            {
                out2 = out2 + Integer.toString(dd) + suffix[4] + "-";
            }
            if(Integer.toString(dd).charAt(1) == '1' && Integer.toString(dd).length() > 1)
            {
                out2 = out2 + Integer.toString(dd) + suffix[1] + "-";
            }
            if(Integer.toString(dd).charAt(1) == '3' && Integer.toString(dd).charAt(0) == '1' && Integer.toString(dd).length() > 1)
            {
                out2 = out2 + Integer.toString(dd) + suffix[4] + "-";
            }
            if(Integer.toString(dd).charAt(1) == '2' && Integer.toString(dd).charAt(0) == '1' && Integer.toString(dd).length() > 1)
            {
                out2 = out2 + Integer.toString(dd) + suffix[4] + "-";
            }
            if(Integer.toString(dd).charAt(0) == '1' && Integer.toString(dd).length() == 1)
            {
                out2 = out2 + Integer.toString(dd) + suffix[1] + "-";
            }
            if(Integer.toString(dd).length() > 1 && Integer.toString(dd).charAt(0) == '1' && Integer.toString(dd).charAt(1) == '1')
            {
                out2 = out2 + Integer.toString(dd) + suffix[4] + "-";
            }
            else if(dd > 10 && Integer.toString(dd).charAt(1) == '3' && Integer.toString(dd).charAt(0) != '1'|| Integer.toString(dd).charAt(1) == '2' && Integer.toString(dd).charAt(0) != '1')
            {
                out2 = out2 + Integer.toString(dd) + suffix[Integer.parseInt(Integer.toString(dd).charAt(1)+"")] + "-";
            }
        } 
        catch (Exception e) {}
        if(dd < 10)
        {
            out2 = out2 + Integer.toString(dd) + suffix[Integer.parseInt(Integer.toString(dd).charAt(0)+"")] + "-";
        }
        if(mm < 10)
        {
            out2 = out2 + mon[Integer.parseInt(Integer.toString(mm).charAt(0)+"")] + "-" + Integer.toString(yy);
        }
        if(mm>10)
        {
            out2 = out2 + mon[Integer.parseInt(((Integer.toString(mm).charAt(0))+"")+((Integer.toString(mm).charAt(1))+""))] + "-" + Integer.toString(yy);
        }
        System.out.println("Output 2 : "+out2);
    }

    public static void main(String args[])throws IOException
    {
        MyDate3 ob = new MyDate3();
        ob.Accept();
        ob.Output1();
        ob.Output2();
    }
}

    
