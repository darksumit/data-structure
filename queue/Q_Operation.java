/*A queue is created with 100 elements. n elements inserted and m elements deleted. Display the queue after deletion of m elements and then retrieve the deleted elements*/
import java.util.*;
class Q_Operation
{
    int i,f,r,n,m;
    int q[]=new int[100];
    Q_Operation()
    {
        for(i=0;i<100;i++)
        q[i]=0;
        f=-1;
        r=-1;
    }
    void insert()
    {
        if(r==99)
        System.out.println("Queue Overflows");
        else
        {
            if(f==-1 && r==-1)
            {
                f=0;
                r=0;
            }
            Scanner in=new Scanner(System.in);
            System.out.println("Enter number of elements to be inserted");
            n=in.nextInt();
            System.out.println("Enter data elements");
            for(i=0;i<n;i++)
            q[r++]=in.nextInt();
        }
    }
    void delete()
    {
        if(f==-1 && r==-1)
        System.out.println("Queue Underflows");
        else if(f==r)
        {
            f=-1;
            r=-1;
        }
        else
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter number of elements to be deleted");
            m=in.nextInt();
            for(i=0;i<m;i++)
            {
                if(f==r)
                {
                    System.out.println("Queue Underflows");
                    break;
                }
                System.out.println("Deleted element="+q[f++]);
            }
        }
    }
    void display()
    {
        if(f==-1 && r==-1)
        System.out.println("Queue is empty");
        else if(f==r && f!=0)
        System.out.println("Queue Underflows");
        else
        {
            System.out.println("Elements of the Queue:");
            for(i=f;i<r;i++)
            System.out.println(q[i]);
        }
    }
    void retrieve()
    {
        if(f==-1 && r==-1)
        System.out.println("Queue is empty");
        else
        {
            System.out.println("Elements of the Queue:");
            for(i=0;i<r;i++)
            System.out.println(q[i]);
        }
    }
}