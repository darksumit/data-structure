//Program to print the Transpose of a Matrix
import java.util.*;
class Transpose
{
    public static void main(String args[])
    {
        int i,j,r,c;
        Scanner arr=new Scanner(System.in);
        System.out.println("Enter number of rows");
        r=arr.nextInt();
        System.out.println("Enter number of columns");
        c=arr.nextInt();
        int A[][]=new int[r][c];
        System.out.println("Enter elements of matrix");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]=arr.nextInt();
            }
        }
        System.out.println("Original matrix:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Transpose of the matrix:");
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(A[j][i]+"\t");
            }
            System.out.println();
        }
    }
}