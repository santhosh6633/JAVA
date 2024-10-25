import java.io.*;
import java.util.Scanner;
public class Array3D
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[][][]=new int[2][3][5];
        System.out.println("Enter elements:");
        for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
        for(int k=0;k<5;k++)
        x[i][j][k]=sc.nextInt();
        }
        }
        for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
        for(int k=0;k<5;k++)
        System.out.print(x[i][j][k]+" ");
        System.out.println();
        }
        System.out.println();}
    }
}
