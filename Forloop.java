import java.util.Scanner;
class Forloop{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=obj.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(i*n);
        }
    }
}