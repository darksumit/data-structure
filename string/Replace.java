import java.io.*;
public class Replace
{
    public static void main(String args[])throws IOException
    {
        int i,k=0;
        String s,e,r,w="";
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter String");
        s=in.readLine();
        s=s+" ";
        System.out.println("Enter word to be replaced");
        r=in.readLine();
        System.out.println("Enter word to be entered");
        e=in.readLine();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                if(w.equalsIgnoreCase(r))
                {
                    w=e;
                    k++;
                }
                System.out.print(w+" ");
                w="";
            }
            else
            w=w+s.charAt(i);
        }
        System.out.println();
        if(k==0)
        System.out.println("Word missing from String!");
    }
}