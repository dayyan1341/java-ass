public class Ques24 {
    public static void main(String[] args) {
        int x[] = {2,3,54,3,56,76,23,879,234,54676,8879432,2};

        System.out.print("{");
        for (int el : x) {
            System.out.printf(" %d ",el);
        }
        System.out.println("}");

        if (x[0] == x[x.length-1] ) System.out.printf("First and last element are same");
        else System.out.println("First and last element are not same");

    }
}
