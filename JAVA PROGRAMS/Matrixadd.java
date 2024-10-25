import java.io.*;
import java.util.Scanner;
public class Matrixadd
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of rows and coloms of matrix 1: ");
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    System.out.println("Enter size of rows and coloms of matrix 2: ");
    int r2=sc.nextInt();
    int c2=sc.nextInt();
    int a[][]=new int[r1][c1];
    int b[][]=new int[r2][c2];
    if(r1!=r2 || c1!=c2)
    {
         System.out.println("Addition not possible");
    }
    else
    {
    System.out.println("ENter "+(r1*c1)+" Elements into 1st matrix: ");
    for(int i=0;i<r1;i++)
    {
    for(int j=0;j<c1;j++)
    {
        a[i][j]=sc.nextInt();
    }
    }
    System.out.println("Enter "+(r2*c2)+" Elements into 2 nd matrix: ");
    for(int i=0;i<r2;i++)
    {
    for(int j=0;j<c2;j++)
    {
        b[i][j]=sc.nextInt();
    }
    }
    int c[][]=new int[r1][c2];
    for(int i=0;i<r1;i++)
    {
    for(int j=0;j<c1;j++)
    {
        c[i][j]=a[i][j]+b[i][j];
    }
    }
    System.out.println("After Summation the resultant matrix is: ");
    for(int i=0;i<r1;i++)
    {
    for(int j=0;j<c1;j++)
    {
        System.out.print(c[i][j]+" ");
    }
    System.out.println();
    }
    }
    }
}
