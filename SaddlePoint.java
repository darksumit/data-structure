//Program to check whether the saddle point of a matrix exists or not
import java.util.*;
class SaddlePoint
{
    public static void main(String args[])
    {
        int i,j,k,l,n,p,min,max=0;
        Scanner arr=new Scanner(System.in);
        System.out.println("Enter order of Matrix");
        n=arr.nextInt();
        int A[][]=new int[n][n];
        System.out.println("Enter elements of the Matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                A[i][j]=arr.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        p=0;
        for(i=0;i<n;i++)
        {
            min=A[i][0];
            l=0;
            for(j=0;j<n;j++)
            {
                if(A[i][j]<min)
                {
                    min=A[i][j];
                    l=j;
                }
            }
            max=A[0][l];
            for(k=0;k<n;k++)
            {
                if(A[k][l]>max)
                max=A[k][l];
            }
            if(max==min)
            {
                p=1;
                break;
            }
        }
        if(p==1)
        System.out.println("Saddle Point="+max);
        else
        System.out.println("Saddle Point does not exist.");
    }
}
