import java.io.*;
class Fibrec{
    int fib(int n){
        if(n==0)
        return 0;
        else if(n==1)
        return 1;
        else
        return (fib(n-1)+fib(n-2));
    }
    public static void main(String args[]){
        Fibrec f=new Fibrec();
        int n=Integer.parseInt(args[0]);
        for(int i=0;i<n;i++)
        System.out.println(f.fib(i));
    }
}
