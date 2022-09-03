import java.util.Scanner;

public class Ques5 {
    // Ques no. 5

    public static void main(String[] args) {
        int x, y, z;
        Scanner scan = new Scanner(System.in);

        System.out.print("x : ");
        x = scan.nextInt();
        System.out.print("y : ");
        y = scan.nextInt();
        System.out.print("z : ");
        z = scan.nextInt();
        System.out.println();

        System.out.println("Average = " + (x + y + z) / 3);
    }
}