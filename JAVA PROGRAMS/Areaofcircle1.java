import java.io.*;
import java.util.*;
import java.lang.Math;
class Area
{
    double x,y,r;
    double area()
    {
        return (22/7.0)*r*r;
    }
}
class Areaofcircle1
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    Area a=new Area();
    System.out.println("Enter x,y Values: ");
    a.x=sc.nextDouble();
    a.y=sc.nextDouble();
    a.r=Math.sqrt((a.x*a.x)+(a.y*a.y));
    System.out.println("Area of circle: "+a.area());
    }
}
