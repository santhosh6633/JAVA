import java.io.*;
abstract class Bas{
    abstract void fun();
}
class Derived extends Bas{
    void fun(){
        System.out.println("Derived fun is invoked");
    }
}
class Abstractdemo
{
    public static void main(String args[])
    {
        //A a=new A();
        //The above throws an error..!
        Derived b=new Derived();
        Bas c=new Derived();
        b.fun();
        c.fun();
    }
}

