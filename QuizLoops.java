//print sum of first n natural numbers with for loop
import java.util.Scanner;
class QuizLoops{
    public static void main(String args[]){
        //for loop
        //for(int i=0;i<4;i++){
        //    System.out.println(i);
        //}
        //for loop to print sum of n natural numbers
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number");
        int n= obj.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
             sum=sum+i;
        }
        System.out.println(sum);
        //whileloop
        //int i=0;
        //while(i<4){
        //    System.out.println(i);
        //}
        //while loop to print sum of n natural numbers
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number");
        int n= obj.nextInt();
        int sum=0;
        int i=0;
        while(i<n){
             sum=sum+i;
             i=i+1;
        }
        System.out.println(sum);
              

    }
}