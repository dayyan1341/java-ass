import java.util.Scanner;

public class Ques6 {
    //Ques 6

    public static void main (String[]args)
    {
        int x,y,z,temp;
        Scanner scan = new Scanner(System.in);

        System.out.print ("x : ");
        x = scan.nextInt ();
        System.out.print ("y : ");
        y = scan.nextInt ();

        System.out.println();

        System.out.println("Initially x = "+x +", y = "+ y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("Finally x = " + x + ", y = " + y);

    }
}
