import java.io.*;
import java.util.Scanner;
public class MatrixDemo
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of rows and coloms of matrix: ");
    int r=sc.nextInt();
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    System.out.println("ENter "+(r*c)+" Elements into matrix: ");
    for(int i=0;i<r;i++)
    {
    for(int j=0;j<c;j++)
    {
        a[i][j]=sc.nextInt();
    }
    }
    System.out.println("The elements in the matrix are: ");
    for(int i=0;i<r;i++)
    {
    for(int j=0;j<c;j++)
    {
        System.out.print(a[i][j]+" ");
    }
    System.out.println();
    }
    }
}
