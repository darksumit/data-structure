//Program to find the product of two matrices
import java.util.*;
class Product
{
    public static void main(String args[])
    {
        int i,j,k,n;
        Scanner arr=new Scanner(System.in);
        System.out.println("Enter order of Matrix");
        n=arr.nextInt();
        int A[][]=new int[n][n];
        int B[][]=new int[n][n];
        int C[][]=new int[n][n];
        System.out.println("Enter elements of first Matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                A[i][j]=arr.nextInt();
            }
        }
        System.out.println("Original Matrix A:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Enter elements of second Matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                B[i][j]=arr.nextInt();
            }
        }
        System.out.println("Original Matrix B:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                C[i][j]=0;
                for(k=0;k<n;k++)
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
