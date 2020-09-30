//Program to find the Determinant of a 3 by 3 Matrix
import java.util.*;
class Determinant
{
    public static void main(String args[])
    {
        int i,j,k,m,n,s=0;
        Scanner arr=new Scanner(System.in);
        int A[][]=new int[3][3];
        System.out.println("Enter elements of the Matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                A[i][j]=arr.nextInt();
            }
        }
        System.out.println("Original Matrix A:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        for(k=0;k<3;k++)
        {
            m=k+1;
            if(m>=3)
            m-=3;
            n=k+2;
            if(n>=3)
            n-=3;
            s+=A[0][k]*(A[1][m]*A[2][n]-A[1][n]*A[2][m]);
        }
        System.out.println("Determinant="+s);
    }
}
