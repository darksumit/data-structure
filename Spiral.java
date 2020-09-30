//Program to create a Spiral Matrix
import java.util.*;
class Spiral
{
    public static void main(String args[])
    {
        int i,j,n;
        Scanner arr=new Scanner(System.in);
        System.out.println("Enter order of Matrix");
        n=arr.nextInt();
        int A[][]=new int[n][n];
        int k=n*n,r1=0,r2=n-1,c1=0,c2=n-1;
        while(k>0)
        {
            for(i=c1;i<=c2;i++)
            A[r1][i]=k--;
            for(i=r1+1;i<=r2;i++)
            A[i][c2]=k--;
            for(i=c2-1;i>=c1;i--)
            A[r2][i]=k--;
            for(i=r2-1;i>=r1+1;i--)
            A[i][c1]=k--;
            c1++;c2--;r1++;r2--;
        }
        System.out.println("Spiral Matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }
}