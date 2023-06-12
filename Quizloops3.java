import java.util.Scanner;
class QuizLoops3{
    public static void main(String args[]){
        //do whileloop
        //int i=0;
        //do{
        //    System.out.println(i);
        //    i=i+1;
        //}
        //while(i<4);

        //do while loop to print sum of n natural numbers
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number");
        int n= obj.nextInt();
        int sum=0;
        int i=0;
        do{
             sum=sum+i;
             i=i+1;
             System.out.println(sum);
             
        }
        while(i<n);

    }
}