import java.util.Scanner;
public class reverse 
{
    public static String ters(String t,String s,int n)
    {
        if (n<=-1)
            return s;

        s+=t.charAt(n);
        return ters(t,s,n-1) ;  
    }
    public static void main(String[]args)
    {   String s="";
        String s1;
        Scanner read=new Scanner(System.in);
        String t=read.nextLine();
        s1=ters(t,s,t.length()-1);
        System.out.println(s1);
    }      
}
