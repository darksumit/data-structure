//Stack to store names of persons
class Alpha_Stack
{
    int n,sp;
    String s[];
    Alpha_Stack(int size)
    {
        n=size;
        sp=-1;
        s=new String[n];
    }
    void push(String item)
    {
        if(sp==n-1)
        System.out.println("Stack Overflows");
        else
        s[++sp]=item;
    }
    void pop()
    {
        if(sp==-1)
        System.out.println("Stack Underflows");
        else
        System.out.println("Popped out value="+s[sp--]);
    }
    void display()
    {
        if(sp==-1)
        System.out.println("Stack is empty");
        else
        {
            System.out.println("sp-->| "+s[sp]+" |");
            System.out.println("      ________");
            for(int i=sp-1;i>=0;i--)
            {
                System.out.println("     | "+s[i]+" |");
                System.out.println("      ________");
            }
        }
    }
}