import java.util.Scanner;

public class Ques8 {
    // ques 8
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);

        System.out.print("x : ");
        x = scan.nextInt();

        System.out.println();

        if (x % 2 == 0) System.out.println(x + " is even");
        else System.out.println(x + " is odd");
    }
}
