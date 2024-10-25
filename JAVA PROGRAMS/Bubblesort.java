import java.io.*;
import java.util.Scanner;
public class Bubblesort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+"Elements into array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("The elements after sorted are: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
