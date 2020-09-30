import java.util.*;
public class Anagrams
{
    public static void main(String args[])
    {
        int l1, l2, i, j, k=0;
        String w1, w2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Words");
        w1=sc.nextLine();
        w2=sc.nextLine();
        w1=w1.toLowerCase();
        w2=w2.toLowerCase();
        l1=w1.length();
        l2=w2.length();
        if(l1==l2)
        {
            for(i=0;i<l1;i++)
            {
                for(j=0;j<l2;j++)
                {
                    if(w1.charAt(i)==w2.charAt(j))
                    k=1;
                }
                if(k==0)
                break;
            }
        }
        else
        System.out.println("Wrong Input!");
        if(k==1)
        System.out.println("The words are Anagrams");
        else
        System.out.println("The words are not Anagrams");
    }
}
        