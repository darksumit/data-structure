import java.util.*;
public class Reverse
{
    public static void main(String args[])
    {
        int i,l,x;
        char c;
        String s0,s="",w="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String");
        s0=in.nextLine();
        s0=s0+" ";
        l=s0.length();
        System.out.println("1.Letters Reversed \n2.Words Reversed \n3.Sting Reversed");
        System.out.println("Enter Your Choice");
        x=in.nextInt();
        switch (x)
        {
            case 1:
            for(i=0;i<l;i++)
            {
                c=s0.charAt(i);
                if(c==' ')
                {
                    s=s+" "+w;
                    w="";
                }
                else
                w=c+w;
            }
            System.out.println(s);
            break;
            case 2:
            for(i=0;i<l;i++)
            {
                c=s0.charAt(i);
                if(c==' ')
                {
                    s=w+" "+s;
                    w="";
                }
                else
                w=w+c;
            }
            System.out.println(s);
            break;
            case 3:
            for(i=0;i<l;i++)
            {
                c=s0.charAt(i);
                s=c+s;
            }
            System.out.println(s);
            break;
            default:
            System.out.println("Wrong Input!");
        }
    }
}
            