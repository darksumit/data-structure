import java.util.*;
public class PigLatin
{
    public static void main(String args[])
    {
        int i,l;
        char c;
        String w1,w2="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        w1=sc.nextLine();
        w1=w1.toLowerCase();
        l=w1.length();
        for(i=0;i<l;i++)
        {
            c=w1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            break;
        }
        w2=w1.substring(i)+w1.substring(0,i)+"ay";
        System.out.println(w2);
    }
}