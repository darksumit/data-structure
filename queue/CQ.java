/*Program to create a circular queue and perform basic functions: insertion and deletion*/
import java.io.*;
class CQ
{
    int i,f,r;
    int q[]=new int[10];
    CQ()
    {
        for(i=0;i<10;i++)
        q[i]=0;
        f=-1;
        r=-1;
    }
    void insert(int item)
    {
        if(r==9 && f==0)
        System.out.println("Queue Overflows");
        else if(r==9)
        {
            r=0;
            q[r]=item;
        }
        else if(f==-1 && r==-1)
        {
            f=r=0;
            q[r]=item;
        }
        else if(r+1==f)
        System.out.println("Queue Overflows");
        else
        q[++r]=item;
    }
    void delete()
    {
        if(r==-1)
        System.out.println("Queue Underflows");
        else
        System.out.println("Deleted element="+q[f++]);
    }
    void display()
    {
        if(f==-1 && r==-1)
        System.out.println("Queue is empty");
        else
        {
            System.out.println("Elements of the Queue:");
            if(f<=r)
            {
                for(i=f;i<=r;i++)
                System.out.println(q[i]);
            }
            else
            {
                for(i=f;i<10;i++)
                System.out.println(q[i]);
                for(i=0;i<=r;i++)
                System.out.println(q[i]);
            }
        }
    }
}