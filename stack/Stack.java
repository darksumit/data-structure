/*Program to create a stack of data elements and perform basic functions: pushing and popping*/
import java.io.*;
class Stack
{
    int sp;
    int s[]=new int[20];
    Stack()
    {
        for(int i=0;i<20;i++)
        s[i]=0;
        sp=-1;
    }
    void push(int item)
    {
        if(sp==19)
        System.out.println("Stack Overflows");
        else
        s[++sp]=item;
    }
    void pop()
    {
        if(sp==-1)
        System.out.println("Stack Underflows");
        else
        System.out.println("Popped out element="+s[sp--]);
    }
    void display()
    {
        if(sp==-1)
        System.out.println("Stack is empty");
        else
        {
            System.out.println("sp-->| "+s[sp]+" |");
            System.out.println("      ____");
            for(int i=sp-1;i>=0;i--)
            {
                System.out.println("     | "+s[i]+" |");
                System.out.println("      ____");
            }
        }
    }
}