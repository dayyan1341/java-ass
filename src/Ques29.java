public class Ques29 {
    public static void main(String[] args) {

        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] array2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int r1, r2, c1, c2;
        r1 = array1.length;
        c1 = array1[0].length;

        r2 = array2.length;
        c2 = array2[0].length;

        int[][] result;

        if (c1 != r2) {
            System.out.println("Can't Multiply");
            result = new int[0][0];
        } else {
            result = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        result[i][j] += array1[i][k] * array2[k][j];
                    }
                }
            }
        }

        for (int[] arr : result) {
            for (int el : arr) {
                System.out.printf(" %4d ", el);
            }
            System.out.println();
        }

    }
}
