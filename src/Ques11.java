import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.print("Number : ");
        int num = in.nextInt();

        System.out.println("");

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }
}
