import java.util.*;
public class Palindro
{
    public static void main(String args[])
    {
        int l,i;
        String w1,w2="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        w1=sc.nextLine();
        l=w1.length();
        for(i=0;i<l;i++)
        w2=w1.charAt(i)+w2;
        if(w2.equalsIgnoreCase(w1))
        System.out.println("Word is a Palindrome");
        else
        System.out.println("Word is a not Palindrome");
    }
}