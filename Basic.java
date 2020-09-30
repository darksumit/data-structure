//Program to accept a simple one-dimensional integer array and display its elements
import java.util.*;
class Basic
{
    public static void main(String args[])
    {
        int i,n;
        Scanner arr=new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=arr.nextInt();
        int A[]=new int[n];
        System.out.println("Enter elements of the array");
        for(i=0;i<n;i++)
        A[i]=arr.nextInt();
        System.out.println("Elements of the array are:");
        for(i=0;i<n;i++)
        System.out.print(A[i]+" ");
    }
}
