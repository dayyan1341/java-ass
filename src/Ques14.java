import java.util.Scanner;

public class Ques14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Factorial of : ");
        int n = in.nextInt();
        System.out.print("is : "+ fact(n));

    }

    public static int fact(int n){
        if( n == 1) return 1;
        return n*fact(n-1) ;
    }

}
