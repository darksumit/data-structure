import java.util.*;
public class Total
{
    public static void main(String args[])
    {
        int i,l,d,x,letters=0,space=0,sentence=0;
        char c;
        String s;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String");
        s=in.nextLine();
        l=s.length();
        System.out.println("1.Total Letters \n2.Total Words \n3.Total Sentences");
        System.out.println("Enter Your Choice");
        x=in.nextInt();
        switch (x)
        {
            case 1:
            for(i=0;i<l;i++)
            {
                c=s.charAt(i);
                d=(int) c;
                if((d>=65 && d<=90) || (d>=97 && d<=122))
                letters++;
            }
            System.out.println(letters);
            break;
            case 2:
            for(i=0;i<l;i++)
            {
                c=s.charAt(i);
                if(c==' ')
                space++;
            }
            System.out.println(space+1);
            break;
            case 3:
            for(i=0;i<l;i++)
            {
                c=s.charAt(i);
                if(c=='.' ||c=='?' ||c=='!')
                sentence++;
            }
            System.out.println(sentence);
            break;
            default:
            System.out.println("Wrong Input!");
        }
    }
}
            