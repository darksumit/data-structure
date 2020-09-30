//Menu-Driven Program to Rotate a given Matrix
import java.util.*;
class Rotation
{
    public static void main(String args[])
    {
        int i,j,r,c,x;
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
        System.out.println("1.Rotate 90degrees clock-wise");
        System.out.println("2.Rotate 180degrees clock-wise");
        System.out.println("3.Rotate 270degrees clock-wise");
        System.out.println("Enter your choice");
        x=arr.nextInt();
        System.out.println("Rotated matrix:");
        switch (x)
        {
            case 1:
            for(i=0;i<c;i++)
            {
                for(j=r-1;j>=0;j--)
                {
                    System.out.print(A[j][i]+"\t");
                }
                System.out.println();
            }
            break;
            case 2:
            for(i=r-1;i>=0;i--)
            {
                for(j=c-1;j>=0;j--)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
            break;
            case 3:
            for(i=c-1;i>=0;i--)
            {
                for(j=0;j<r;j++)
                {
                    System.out.print(A[j][i]+"\t");
                }
                System.out.println();
            }
            break;
            default:
            System.out.println("Wrong Input!");
        }
    }
}