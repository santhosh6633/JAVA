import java.io.*;
import java.util.Scanner;
class Evenodd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num;
System.out.println("Enter an integer to check weather it is Even or odd:");
num=sc.nextInt();
if(num%2==0)
{
System.out.println(num+"is Even integer");
}
else
{
System.out.println(num+"is a odd integer");
}
}
}
