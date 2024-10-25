import java.io.*;
import java.util.*;
class Area
{
    int l,b;
    int area()
    {
        return l*b;
    }
}
public class Rectanglearea
{
    public static void main(String args[])
    {
    Area a=new Area();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter l,b values:");
    a.l=sc.nextInt();
    a.b=sc.nextInt();
    System.out.println("Area of rectangle is:"+a.area());
    }
}
