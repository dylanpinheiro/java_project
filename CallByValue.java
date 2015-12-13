class CallByValue
{  
    int data=50;   
    void change(int data)
    {  
        data=data+100;
    }  

    public static void main(String args[])
    {  
        CallByValue ob=new CallByValue();  
        System.out.println("Before change = "+ob.data);  
        ob.change(500);  
        System.out.println("After change = "+ob.data);  

    }  
}  
