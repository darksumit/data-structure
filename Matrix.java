//Program to accept a simple two dimensional array (Matrix) and display its elements
import java.util.*;
class Matrix
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
        System.out.println("Enter elements of the array");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]=arr.nextInt();
            }
        }
        System.out.println("Elements of the array are:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.println("Element at row "+(i+1)+" and column "+(j+1)+"="+A[i][j]);
            }
        }
    }
}
