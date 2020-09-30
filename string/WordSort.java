import java.io.*;
class WordSort
{
    public static void main(String args[])throws IOException
    {
        int i,j,n;
        String t;
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter number of applications");
        n=Integer.parseInt(in.readLine());
        String name[]=new String[n];
        System.out.println("Enter names of applicants");
        for(i=0;i<n;i++)
        name[i]=in.readLine();
        for(i=0;i<n-1;i++)
        {
            for(j=i;j<n;j++)
            {
                if(name[i].compareTo(name[j])>0)
                {
                    t=name[i];
                    name[i]=name[j];
                    name[j]=t;
                }
            }
        }
        System.out.println("The sorted list is:");
        for(i=0;i<n;i++)
        System.out.println(name[i]);
    }
}
        