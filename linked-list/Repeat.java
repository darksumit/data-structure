/*Program to display the functioning of a linear queue*/
class Repeat
{
    int q[],i,n,f,r;
    Repeat(int size)
    {
        n=size;
        f=r=-1;
        q=new int[n];
    }
    void push(int val)
    {
        if(r==-1)
        {
            f=r=0;
            q[r]=val;
        }
        else if (r==n)
        System.out.println("Queue Overflow");
        else
        q[++r]=val;
    }
    void pop()
    {
        if(f==-1)
        System.out.println("Queue Underflows");
        else if(f==r)
        {
            System.out.println("Popped out element="+q[f]);
            f=-1;
            r=-1;
        }
       else
       System.out.println("Popped out element="+q[f++]);
    }
    void display()
    {
        System.out.println("The elements are:");
        for(i=f;i<=r;i++)
        System.out.println(q[i]);
    }
}