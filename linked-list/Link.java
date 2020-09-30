/*Program to add integers from the rear end of a queue and remove integers from the front end*/
class Link
{
    int q[]=new int[100];
    int f,r,n;
    Link(int size)
    {
        n=size;
        f=r=0;
    }
    void add(int val)
    {
        if(r==0)
        {
            f=r=1;
            q[r]=val;
        }
        else if(r==n)
        System.out.println("Queue Overflows");
        else
        q[++r]=val;
    }
    void remove()
    {
        if(f==0)
        System.out.println("Queue is empty");
        else if(f==r)
        {
            System.out.println("Popped out element="+q[f]);
            f=r=0;
        }
        else
        System.out.println("Popped out element="+q[f++]);
    }
    void display()
    {
        System.out.println("The elements are:");
        for(int i=f;i<=r;i++)
        System.out.println(q[i]);
    }
}