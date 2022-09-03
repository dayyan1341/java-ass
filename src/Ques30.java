import java.util.Scanner;

public class Ques30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input any 10 numbers : ");

        int x[] = new int[10];

        for (int i = 0; i < x.length; i++) {
            x[i] = scan.nextInt();
        }

        for (int num: x ) {
            if (num == 0 || num == 1 ){
                System.out.printf("Is %d Prime --> Ask a Mathematician \n",num);
            } else System.out.println("Is " + num + " Prime -->" + isPrime(num));
        }


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
