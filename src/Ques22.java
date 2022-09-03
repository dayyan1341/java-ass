import java.util.Scanner;

public class Ques22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] x = new int[10];

        for (int i = 0; i < x.length; i ++ ) {
            x[i] = scan.nextInt();
        }

        System.out.print("{");
        for (int el : x) {
            System.out.printf(" %d ", el);
        }
        System.out.println("}");

    }
}
