/*Program to add and remove integers from either end of a queue*/
class Dequeue
{
    int a[],n,f,r;
    Dequeue(int size)
    {
        n=size;
        f=r=-1;
        a=new int[n];
    }
    void pushrear(int val)
    {
        if(r<n-1)
        a[++r]=val;
        else
        System.out.println("Rear Overflow");
    }
    void pushfront(int val)
    {
        if(f==0 || f==1)
        System.out.println("Front Overflow");
        else
        a[--f]=val;
    }
    void popfront()
    {
        if(f<=r)
        {
            if(f==-1)
            f++;
            System.out.println("Popped out element="+a[f++]);
        }
        else
        System.out.println("Queue Underflows");
    }
    void poprear()
    {
        if(f>r || f==0 || r==0)
        System.out.println("Queue Underflows");
        else
        System.out.println("Popped out element="+a[r--]);
    }
    void display()
    {
        if(f==-1 && r==-1)
        System.out.println("Queue is empty");
        else
        {
            System.out.println("Elements of the Queue:");
            for(int i=f+1;i<=r;i++)
            System.out.println(a[i]);
        }
    }
}