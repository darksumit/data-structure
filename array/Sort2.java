//Program to sort the array using bubble sort technique
import java.util.*;
class Sort2
{
    public static void main(String args[])
    {
        int i,j,n,t,x;
        Scanner arr=new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=arr.nextInt();
        int A[]=new int[n];
        System.out.println("Enter elements of the array");
        for(i=0;i<n;i++)
        A[i]=arr.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(A[j]>A[j+1])
                {
                    t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }
            }
        }
        System.out.println("1.Ascending Order");
        System.out.println("2.Descending Order");
        System.out.println("Enter your choice:");
        x=arr.nextInt();
        switch (x)
        {
            case 1:
            System.out.println("Elements in ascending order:");
            for(i=0;i<n;i++)
            System.out.print(A[i]+" ");
            break;
            case 2:
            System.out.println("Elements in descending order:");
            for(i=n-1;i>=0;i--)
            System.out.print(A[i]+" ");
            break;
            default:
            System.out.print("Wrong Input!");
        }
    }
}