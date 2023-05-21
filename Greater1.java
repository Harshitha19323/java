import java.util.Scanner;
public class Greater1
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==b)
        {
            System.out.println("a  is equal to b");
        }
        else
        {
            if(a>b)
            {
                System.out.println("a  grater than b");
            }
            else
            {
                System.out.println("a lesser than b");
            }
        }
    }
}
