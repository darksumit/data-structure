import java.io.*;
public class Frequency
{
    public static void main(String args[])throws IOException
    {
        int i,l,x,k=0;
        char c,d;
        String s,w1,w2="";
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter String");
        s=in.readLine();
        s=s+" ";
        l=s.length();
        System.out.println("1.Frequency of Letter \n2.Frequency of Word");
        System.out.println("Enter Your Choice");
        x=Integer.parseInt(in.readLine());
        switch (x)
        {
            case 1:
            System.out.println("Enter Letter");
            d=(char) (in.read());
            for(i=0;i<l;i++)
            {
                c=s.charAt(i);
                if(c==d)
                k++;
            }
            System.out.println(k);
            break;
            case 2:
            System.out.println("Enter Word");
            w1=in.readLine();
            for(i=0;i<l;i++)
            {
                c=s.charAt(i);
                if(c==' ')
                {
                    if(w2==w1)
                    k++;
                    w2="";
                }
                else
                w2=w2+c;
            }
            System.out.println(k);
            break;
            default:
            System.out.println("Wrong Input!");
        }
    }
}
            