package L3_ControlFlowStatements.l3_4_Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        /*
            1
            1 2
            1 2 3
            1 2 3 4
         */
        int n = 4;
        for(int i = 0; i < n; i++) {
            int num = 1;
            for(int j = 0; j < i + 1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println();

        //! Or

        for(int i = 1; i <= n; i++) {
            int num = 1;
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        System.out.println();

        /*
            this is called Floyd's Triangle

            1
            2 3
            4 5 6
            7 8 9 10
         */

        int N = 4;
        int num = 1;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println();

        /*
           1 2 3 4
           1 2 3
           1 2
           1
         */
        int H = 4;
//        int num2 = 1;       for inverted Floyd's triangle
        for(int i = H; i > 0; i--) {
            int num2 = 1;
            for(int j = 0; j < i; j++) {
                System.out.print(num2 + " ");
                num2++;
            }
            System.out.println();
        }


    }
}
