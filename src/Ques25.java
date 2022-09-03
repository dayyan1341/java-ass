public class Ques25 {
    public static void main(String[] args) {
        int x[] = {2,3,54,3,56,76,23,879,234,54676,8879432,234};
        int even = 0, odd = 0;

        System.out.println("Before :");

        System.out.print("{");
        for (int el : x) {
            System.out.printf(" %d ",el);
        }
        System.out.println("}");

        int temp = x[0];
        x[0] = x[x.length-1];
        x[x.length-1] = temp;

        System.out.println("After :");

        System.out.print("{");
        for (int el : x) {
            System.out.printf(" %d ",el);
        }
        System.out.println("}");

    }
}
