import java.util.Scanner;

public class Ques19 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in).useDelimiter("\n");

        String str = scan.nextLine();

        System.out.println("The string is : " + str);
        System.out.println("No. of Letters: " + str.chars().filter(Character::isLetter).count());
        System.out.println("No. of Spaces: " + str.chars().filter(Character::isWhitespace).count());
        System.out.println("No. of Numbers: " + str.chars().filter(Character::isDigit).count());


    }
}
