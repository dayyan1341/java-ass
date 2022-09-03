import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Multiplication table of number : ");
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));
        }

    }
}
