import java.io.*;
import java.util.*;
class Convert
{
    Scanner in = new Scanner(System.in);
    int n;
    Convert()
    {
        n = 0;
    }
    void inpnum()
    {
        System.out.print("Enter number : ");
        n = in.nextInt();
        System.out.println("Output : ");
        extdigit(n);
    }
    void extdigit(int n)
    {
        if(n>0)
        {
            int d = n%10;
            extdigit(n/10);
            num_to_words(d);
        }
    }
    void num_to_words(int ch)
    {
        switch(ch)
        {
            case 0: 
            System.out.println("Zero ");
            break;
            case 1: 
            System.out.println("One ");
            break;
            case 2: 
            System.out.println("Two ");
            break;
            case 3: 
            System.out.println("Three ");
            break;
            case 4: 
            System.out.println("Four ");
            break;
            case 5: 
            System.out.println("Five ");
            break;
            case 6: 
            System.out.println("Six ");
            break;
            case 7: 
            System.out.println("Seven ");
            break;
            case 8: 
            System.out.println("Eight ");
            break;
            case 9: 
            System.out.println("Nine ");
            break;
        }
    }
    public static void main(String args[])throws IOException
    {
        Convert ob = new Convert();
        ob.inpnum();
    }
}
    
