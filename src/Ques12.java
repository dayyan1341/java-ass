import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        int x,t,b=0,i=1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Decimal : ");
        x = scan.nextInt();

        while (x > 0){
            t = x % 2;
            x /= 2;
            b = b + t*i ;
            i *= 10 ;
        }

        System.out.println("Binary : " + b);
    }
}
