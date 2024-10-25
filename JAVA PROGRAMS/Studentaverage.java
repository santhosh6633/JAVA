import java.io.*;
import java.util.Scanner;
public class Studentaverage
{
    public static void main(String args[])
    {
        int s1,s2,s3,s4,s5;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        s4=sc.nextInt();
        s5=sc.nextInt();
        double avg=(s1+s2+s3+s4+s5)/5.0;
        System.out.println("Average of student is: "+avg);
        if(avg>=80)
            System.out.println("student passed in distinction");
        else if(avg>=70 && avg<80)
            System.out.println("Student passed in first class");
        else if(avg>=50 && avg<70)
            System.out.println("Student passed in second class");
        else if(avg>=35 && avg<50)
            System.out.println("student passed in third class");
        else
            System.out.println("Student failed.");
    }
}
