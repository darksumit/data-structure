//Program to search for a particular element in an array
import java.util.*;
class Search
{
    public static void main(String args[])
    {
        int i,j,n,t,x,k=0;
        Scanner arr=new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=arr.nextInt();
        System.out.println("Enter number to be searched");
        x=arr.nextInt();
        int A[]=new int[n];
        System.out.println("Enter elements of the array");
        for(i=0;i<n;i++)
        A[i]=arr.nextInt();
        //Linear Search
        if(n<=1000)
        {
            for(i=0;i<n;i++)
            if(A[i]==x)
            {
                k=1;
                break;
            }
        }
        //Binary Search
        else
        {
            int l=0,u=n,m;
            for(i=0;i<n;i++)
            A[i]=arr.nextInt();
            for(i=0;i<n-1;i++)
            {
                for(j=i;j<n;j++)
                {
                    if(A[i]>A[j])
                    {
                        t=A[i];
                        A[i]=A[j];
                        A[j]=t;
                    }
                }
            }
            //Array sorted
            while(l<=u)
            {
                m=(u+l)/2;
                if(A[m]<x)
                l=m+1;
                if(A[m]>x)
                u=m-1;
                if(A[m]==x)
                {
                    k=1;
                    break;
                }
            }
        }
        if(k==1)
        {
            System.out.println("Search Succesful!");
        }
        else
        {
            System.out.println("Element not found!");
        }
    }
}
