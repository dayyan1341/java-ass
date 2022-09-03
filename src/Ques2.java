// Ques No. 2
import java.util.Scanner;

public class Ques2
{
    static String add (double x, double y)
    {
        return (x + " + " + y + " = " + (x+y));
    }

    static String sub (double x, double y)
    {
        return (x + " - " + y + " = " + (x-y));
    }

    static String multiply (double x,double y){
        return (x + " * " + y + " = " + (x*y));
    }

    static String divide (double x,double y){
        return (x + " / " + y + " = " + (x/y));
    }

    static String remainder (double x,double y){
        return (x + " % " + y + " = " + (x%y));
    }

    public static void main (String[]args)
    {
        double x,y;
        Scanner scan = new Scanner (System.in);

        System.out.print ("x : ");
        x = scan.nextDouble ();

        System.out.print ("y : ");
        y = scan.nextDouble ();


        System.out.println("\n"+add(x,y));
        System.out.println(sub(x,y));
        System.out.println(multiply(x,y));
        System.out.println(divide(x,y));
        System.out.println(remainder(x,y));

    }


}