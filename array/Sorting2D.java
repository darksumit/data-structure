//Program to accept a Matrix and sort its elements using any standard sorting technique
import java.util.*;
class Sorting2D
{
    public static void main(String args[])
    {
        int i,j,k,r,c,t;
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
        k=0;
        int B[]=new int[r*c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                B[k++]=A[i][j];
            }
        }
        for(i=0;i<k-1;i++)
        {
            for(j=i;j<k;j++)
            {
                if(B[i]>B[j])
                {
                    t=B[i];
                    B[i]=B[j];
                    B[j]=t;
                }
            }
        }
        k=0;
        System.out.println("The sorted array is:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]=B[k++];
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }
}