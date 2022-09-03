public class Ques23 {
    public static void main(String[] args) {
        int[] x = {324,43,45,6324,45,62,34,6345,435};
        int sum = 0;

        for (int el: x ) {
            sum += el;
        }
        System.out.println("Sum of all array elements : " + sum);
    }
}
