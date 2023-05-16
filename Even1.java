import java.util.Scanner;
class Even1
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("given number is even");
        }
        else
        {
            System.out.println("given number is not even");

        }

    }
}