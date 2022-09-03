import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        int x,t,s=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Number : ");
        x = scan.nextInt();

        while (x > 0){
            t = x % 10;
            x /= 10;
            s += t ;
        }
        System.out.println("sum = " + s);
    }
}
