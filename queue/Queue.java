/*Program to create a queue of data elements and perform basic functions: insertion and deletion*/
import java.io.*;
class Queue
{
    int f,r;
    int q[]=new int[20];
    Queue()
    {
        for(int i=0;i<20;i++)
        q[i]=0;
        f=-1;
        r=-1;
    }
    void insert(int item)
    {
        if(r==19)
        System.out.println("Queue Overflows");
        else if(f==-1 && r==-1)
        {
            f=0;
            r=0;
        }
        else
        r++;
        q[r]=item;
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
        System.out.println("Deleted element="+q[f++]);
    }
    void display()
    {
        if(f==-1 && r==-1)
        System.out.println("Queue is empty");
        else
        {
            System.out.println("Elements of the Queue:");
            for(int i=f;i<=r;i++)
            System.out.println(q[i]);
        }
    }
}