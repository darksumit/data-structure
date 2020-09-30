//Program to check the validity of a person's Date of Birth and display the day number
import java.util.*;
class DoB
{
    public static void main(String args[])
    {
        int i=1,k=0,s=0,d,m,y;
        Scanner in=new Scanner(System.in);
        int A[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Enter Date of Birth (dd mm yyyy)");
        d=in.nextInt();
        m=in.nextInt();
        y=in.nextInt();
        if(m>12)
        k=1;
        if(m==2)
        {
            if(y%4==0)
            {
                if(d>29)
                k=1;
            }
            else if(d>28)
            k=1;
        }
        if(m==4||m==6||m==9||m==11)
        {
            if(d>30)
            k=1;
        }
        else if(d>31)
        k=1;
        if(k==0)
        {
            System.out.println("Valid Date");
            while(i<m)
            {
                s+=A[i];
                i++;
            }
            s+=d;
            if(y%4==0 && m>2)
            s+=1;
            System.out.println("Day of the year="+s);
        }
        else
        System.out.println("Invalid Date.");
    }
}
