import java.util.Scanner;
public class Conditions2
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("not adult");
        }

    }
}
