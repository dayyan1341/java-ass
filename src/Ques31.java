public class Ques31 {
    public static void main(String[] args) {

//        int[] x = {4,9,6,4,8,7,1,3};
        int swap;
        int t = 0 ;
        int ind = 0;

        int[] x = new int[100];

        for (int i = 0; i < 100; i++) {
            x[i] = 100-i;
        }


        do {

            if ( ind % ( x.length-1 ) == 0){
                ind=0;
                t=0;
            }

            if (x.length == 1 ) break;

            if ( x[ind] > x[ind+1] ){
                swap = x[ind];
                x[ind] = x[ind+1];
                x[ind+1] = swap;
            }
            else t++;

            if (x.length == 2) break;

            ind ++ ;

        } while ( t < x.length-2 );

        System.out.print("{");
        for (int el : x) {
            System.out.printf(" %d ", el);
        }
        System.out.println("}");
    }
}
