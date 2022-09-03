import java.util.Scanner;

public class Ques28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String rev = "";

        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev ;
        }

        if ( str.compareToIgnoreCase(rev) == 0) System.out.println( rev + " is a palindrome");
        else System.out.println("Not a palindrome. Reverse of ( " + str +" ) --> " + rev);
    }
}
