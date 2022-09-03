public class Ques26 {
    public static void main(String[] args) {
        int x[] = { 2,3,54,3,56,76,23,879,234,54676,8879432};
        int min = x[0];
        int max = x[0];

        System.out.print("{");
        for (int el : x) {
            System.out.printf(" %d ",el);
            if ( el <= min ) min = el;
            if ( el >= max ) max = el;
        }
        System.out.println("}");

        System.out.printf("Min --> %d || Max --> %d",min,max);

    }
}
