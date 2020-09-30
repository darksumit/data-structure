/*Program to create an array with the marks of 50 students in ascending order and push into the stack*/
import java.io.*;
class Array_to_Stack
{
    int a[],s[],n,sp;
    Array_to_Stack(int size)
    {
        n=size;
        sp=-1;
        a=new int[n];
        s=new int[n];
    }
    void marks()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter data");
            a[i]=Integer.parseInt(in.readLine());
        }
    }
    void push(int p)
    {
        if(sp==s.length-1)
        System.out.println("Stack Overflows");
        else
        s[++sp]=p;
    }
    void pop()
    {
        if(sp==-1)
        System.out.println("Stack Underflows");
        else
        System.out.println(s[sp--]);
    }
    void display()
    {
        for(int i=sp;i>=0;i--)
        System.out.println(s[i]);
    }
}