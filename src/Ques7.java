import java.util.Scanner;

public class Ques7 {

    public static void main(String[] args) {
        int x, y, z, temp;
        Scanner scan = new Scanner(System.in);

        System.out.print("x : ");
        x = scan.nextInt();
        System.out.print("y : ");
        y = scan.nextInt();

        System.out.println();

        if (x == y) System.out.println("x is equal to y");
        else if (x > y) System.out.println("x is greater than y");
        else System.out.println("x is less than y");
    }
}
