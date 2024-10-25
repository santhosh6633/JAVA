import java.io.*;
class Main{
    static int data=30;
    static class Inner{
        void message()
        {
            System.out.println("The value of data is "+data);
        }
    }
    public static void main(String args[])
    {
        Main.Inner obj=new Main.Inner();
        obj.message();
    }
}
