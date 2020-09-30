/*Program to create a stack of 10 elements, push 6 elements and pop 2 elements*/
import java.util.*;
class S_Operation
{
    int i,sp;
    int s[]=new int[10];
    S_Operation()
    {
        for(i=0;i<10;i++)
        s[i]=0;
        sp=-1;
    }
    void push()
    {
        if(sp==9)
        System.out.println("Stack Overflows");
        else
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter data items");
            for(i=0;i<6;i++)
            s[++sp]=in.nextInt();
        }
    }
    void pop()
    {
        if(sp==-1)
        System.out.println("Stack Underflows");
        else
        {
            for(i=0;i<2;i++)
            System.out.println("Popped out element="+s[sp--]);
        }
    }
    void display()
    {
        if(sp==-1)
        System.out.println("Stack is empty");
        else
        {
            System.out.println("sp-->| "+s[sp]+" |");
            System.out.println("      ____");
            for(i=sp-1;i>=0;i--)
            {
                System.out.println("     | "+s[i]+" |");
                System.out.println("      ____");
            }
        }
    }
}