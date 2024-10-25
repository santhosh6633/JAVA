import java.io.*;
class Employee{
    float sal=500;
}
class Singleinheritance extends Employee
{
      int bon;
      void display()
      {
        //System.System.out.println(sal+bon);
    }
    public static void main(String args[])
    {
        Employee e=new Employee();
        Singleinheritance h=new Singleinheritance();
        e.sal=60;
        h.bon=100;
        System.out.println(e.sal);
        System.out.println(h.bon);
    }
}
