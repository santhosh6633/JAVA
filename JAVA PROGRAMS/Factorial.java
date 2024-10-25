import java.io.*;
import java.util.*;
class Factorial{
    int fact(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no to find factorial:");
        int n=sc.nextInt();
        Factorial a=new Factorial();
        int k=a.fact(n);
        System.out.println("The factorial of "+n+" is: "+k);
    }
}
