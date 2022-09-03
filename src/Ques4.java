// Ques no. 4

import java.util.Scanner;

public class Ques4
{

    public static void main (String[]args)
    {
        double x;
        Scanner scan = new Scanner (System.in);

        System.out.print ("Radius : ");
        x = scan.nextDouble ();
        System.out.println();

        System.out.println("Area = "+(3.14*x*x));
        System.out.println("Perimeter = "+(2*3.14*x));

    }
}