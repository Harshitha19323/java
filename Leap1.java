import java.util.Scanner;
public class Leap1
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%4==0)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("not leap year");
        }

    }
}
