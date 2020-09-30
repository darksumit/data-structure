import java.util.*;
public class LongestWord
{
    public static void main(String args[])
    {
        int i,l;
        char c;
        String s,w1="",w2="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String");
        s=in.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c==' ')
            {
                if(w1.length()>w2.length())
                w2=w1;
                else if(w1.length()==w2.length())
                {
                    System.out.println(w2);
                    w2=w1;
                }
                w1="";
            }
            else
            w1=w1+c;
        }
        System.out.println(w2);
    }
}
            