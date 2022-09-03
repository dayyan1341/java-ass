import java.util.Scanner;

public class Ques17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s1 = scan.next();
        String s2 = scan.next();

        if (s1.equals(s2)) System.out.println("Both strings are equal");
        else System.out.println("Not Equal");
    }
}
