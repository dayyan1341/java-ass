import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("No. of times to print : ");
        int n = in.nextInt();

        System.out.print("Number to print : ");
        int num = in.nextInt();

        System.out.println("");

        for (int i = 0; i < n; i++) {
            System.out.println("num = " + num);
        }

    }
}
