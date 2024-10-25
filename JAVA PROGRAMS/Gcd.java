import java.io.*;
import java.util.*;
class Gcd{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 2 numbers to find GCD: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("GCD of "+a+" and "+b+" is: "+gcd(a,b));
    }
    static int gcd(int a,int b){
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
}
