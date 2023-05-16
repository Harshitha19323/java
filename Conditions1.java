import java.util.Scanner;
class Conditions1
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else
        {
          System.out.println("a is less than b");
        }
    }
}