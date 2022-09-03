import java.util.Scanner;

public class Ques21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Is prime --> ");
        int num = scan.nextInt();
        if (num == 0 || num == 1 ){
            System.out.println("Ask a Mathematician");
        } else System.out.println(isPrime(num));

    }

    public static boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if( num % i == 0){
                return false;
            }
        }
        return true;
    }
}
