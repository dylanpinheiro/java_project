public class Hourglass
{
    public static void main(String[] args) 
    {
        for (int i=9;i>0;i-=2) 
        {
            for (int j=0;j<9-i/2;j++)
                System.out.print(" ");
            for (int j=0;j<i;j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for (int i=2;i<10;i+=2) 
        {
            for (int j=0;j<9-i/2;j++)
                System.out.print(" ");
            for (int j=0;j<=i;j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
