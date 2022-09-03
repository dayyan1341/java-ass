import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan = new Scanner(System.in);

        System.out.print("a : ");
        a = scan.nextInt();
        System.out.print("b : ");
        b = scan.nextInt();
        System.out.print("c : ");
        c = scan.nextInt();

        if ( a<b && a<c) System.out.println("a is the smallest");
        else if ( b<c ) System.out.println("b is smallest");
        else System.out.println("c is smallest");
    }
}
