import java.io.*;
import java.util.*;
class sda1
{
    Scanner in = new Scanner(System.in);
    int a[] = new int[50];
    int b[] = new int[50];
    int ab[] = new int[50];
    int v1,v2;
    sda1()
    {
        for(int i=0;i<50;i++)
        {
            a[i] = b[i] = 0;
        }
        v1 = v2 = 0;
    }

    void Accept()
    {
        System.out.print("Enter the number of values for array 1 : ");
        v1 = in.nextInt();
        for(int i=0;i<v1;i++)
        {
            System.out.println("Enter value "+(i+1));
            a[i] = in.nextInt();
        }
        System.out.print("Enter the number of values for array 2 : ");
        v2 = in.nextInt();
        for(int i=0;i<v2;i++)
        {
            System.out.println("Enter value "+(i+1));
            b[i] = in.nextInt();
        }
    }

    void Join()
    {
        int k = 0;
        while(k < (v1+v2))
        {
            boolean boo = false;
            for(int i=0;i<v1;i++)
            {
                ab[k] = a[i];
                k++;
            }
            for(int i=0;i<v2;i++)
            {
                for(int j=0;j<v1;j++)
                {
                    System.out.println(b[i]+" "+a[j]);
                    if(b[i] == a[j])
                    {
                        boo = true;
                    }
                }
                if(boo == false)
                {
                    ab[k] = b[i];
                    k++;
                } 
            }
        }
    }

    void Display()
    {
        System.out.println("Joined array : ");
        for(int i=0;i<(v1+v2);i++)
        {
            System.out.print(ab[i]+" ");
        }
    }

    public static void main(String args[])throws IOException
    {
        sda1 ob = new sda1();
        ob.Accept();
        ob.Join();
        ob.Display();
    }
}
