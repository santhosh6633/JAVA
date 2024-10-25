import java.io.*;
import java.util.Scanner;
public class DiagonalAddition
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of rows and coloms of matrix: ");
    int r=sc.nextInt();
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    int sum=0;
    if(r!=c)
    {
         System.out.println("Addition not possible");
    }
    else
    {
    System.out.println("Enter "+(r*c)+" Elements into matrix: ");
    for(int i=0;i<r;i++)
    {
    for(int j=0;j<c;j++)
    {
        a[i][j]=sc.nextInt();
    }
    }
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
        if(i==j)
            sum+=a[i][j];
        }
    }
    System.out.println("The sum of diagonal elements is: "+sum);
    }
    }
}
