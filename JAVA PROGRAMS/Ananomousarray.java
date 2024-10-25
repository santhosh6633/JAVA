import java.io.*;
import java.util.Scanner;
public class Ananomousarray
{
    public static void main(String args[])
    {
        printArray(new int[]{10,20,30,40,50});
    }
    static void printArray(int a[])
    {
        System.out.println("The elements in the Anonimous array are: ");
        {
            for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        }
    }
}
