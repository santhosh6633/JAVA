import java.io.*;
import java.util.Scanner;
class Primechecker{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check prime or not: ");
        int n=sc.nextInt();
        boolean k=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                k=false;
                break;
            }
        }
        if(k){
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
}
