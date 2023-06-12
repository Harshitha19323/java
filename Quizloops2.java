//print sum of first n natural numbers with while loop
import java.util.Scanner;
class QuizLoops1{
    public static void main(String args[]){
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