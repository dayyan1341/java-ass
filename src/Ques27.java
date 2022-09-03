public class Ques27 {
    public static void main(String[] args) {
        int x[] = {2,3,54,3,56,76,23,879,234,54676,8879432,234};
        int even = 0, odd = 0;

        System.out.print("{");
        for (int el : x) {
            System.out.printf(" %d ",el);
            if ( el % 2 == 0 ) even ++;
            else odd ++;
        }
        System.out.println("}");

        System.out.printf("There are %d even and %d odd nums in the array",even,odd);

    }
}
