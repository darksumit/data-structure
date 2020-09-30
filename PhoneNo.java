//Program to search for the phone number of a given person using two single dimensional arrays
import java.io.*;
class PhoneNo
{
    public static void main(String args[])throws IOException
    {
        int i,j,n,k=0;
        String x;
        DataInputStream arr=new DataInputStream(System.in);
        System.out.println("Enter number of people");
        n=Integer.parseInt(arr.readLine());
        System.out.println("Enter name of the required person");
        x=arr.readLine();
        String A[]=new String[n];
        String B[]=new String[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Name of the person: ");
            A[i]=arr.readLine();
            System.out.println("Phone number: ");
            B[i]=arr.readLine();
        }
        //Linear Search
        for(i=0;i<n;i++)
        {
            if(A[i].compareTo(x)==0)
            {
                k=i;
                break;
            }
        }
        if(k!=0)
        {
            System.out.println("Search Succesful");
            System.out.println("Name of the person: "+A[i]);
            System.out.println("Phone number: "+B[i]);
        }
        else
        {
            System.out.println("Name not found.");
        }
    }
}
