//Program to search for the largest and smallest numbers in an array
import java.util.*;
class MinMax
{
    public static void main(String args[])
    {
        int i,n,x;
        Scanner arr=new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=arr.nextInt();
        int A[]=new int[n];
        System.out.println("Enter elements of the array");
        for(i=0;i<n;i++)
        A[i]=arr.nextInt();
        int min=A[0],max=A[0];
        for(i=0;i<n;i++)
        {
            if(A[i]<min)
            min=A[i];
            if(A[i]>max)
            max=A[i];
        }
        System.out.println("Largest number="+max);
        System.out.println("Smallest number="+min);
    }
}
       