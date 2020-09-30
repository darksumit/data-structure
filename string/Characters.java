import java.util.*;
public class Characters
{
    public static void main(String args[])
    {
        int i,d,l,a=0,b=0,e=0,f=0,g=0;
        char c;
        String s;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String");
        s=in.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            d=(int) c;
            if(d>=48 && d<=57)
            a++;
            else if(d>=65 && d<=90)
            b++;
            else if(d>=97 && d<=122)
            e++;
            else if(d==32)
            f++;
            else
            g++;
        }
        System.out.println("Number of digits= " +a);
        System.out.println("Number of uppercase letters= " +b);
        System.out.println("Number of lowercase letters= " +e);
        System.out.println("Number of spaces= " +f);
        System.out.println("Number of special characters= " +g);
    }
}