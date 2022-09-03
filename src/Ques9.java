import java.util.Scanner;

public class Ques9 {
    //ques 8

    public static void main (String[]args)
    {
        int x1,y1,x2,y2;
        Scanner scan = new Scanner(System.in);

        System.out.print ("x1 : ");
        x1 = scan.nextInt ();
        System.out.print ("y1 : ");
        x2 = scan.nextInt ();
        System.out.print ("x2 : ");
        y1 = scan.nextInt ();
        System.out.print ("y2 : ");
        y2 = scan.nextInt ();

        System.out.println();

        System.out.println("The distance b/w (x1,y1) and (x2,y2) is : "+ (Math.sqrt( Math.pow( (x1-x2) ,2 ) + Math.pow( (y1-y2), 2) ) ) );
    }
}
