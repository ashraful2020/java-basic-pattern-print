import javax.swing.*;

public class Main {
    public static void main(String[] args) {


//      * * * * * * * * * *
//      *                 *
//      *                 *
//      *                 *
//      *                 *
//      * * * * * * * * * *

//        int n = 6;
//        int m = 10;

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (i == 1 || j == 1 || j == m || i == n ) {
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//      *
//      * *
//      * * *
//      * * * *
//      * * * * *

//        for (int i = 0; i <= 4; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//      * * * * *
//      * * * *
//      * * *
//      * *
//      *

//        for (int i = 5; i > 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//                                     *
//                                  *  *
//                               *  *  *
//                            *  *  *  *
//                         *  *  *  *  *
//                      *  *  *  *  *  *
//                   *  *  *  *  *  *  *
//                *  *  *  *  *  *  *  *
//             *  *  *  *  *  *  *  *  *
//        int x = 10;
//        for (int i = 1; i < x; i++) {
//            for (int j = 0; j <= x - i; j++) {
//                System.out.print("   ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("  *");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i < 6; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print( j );
//            }
//            System.out.println();
//        }
//        int x = 6;
//        for (int i = 1; i < x; i++) {
//            for (int j = 1; j <= x-i; j++) {
//                System.out.print( j );
//            }
//            System.out.println();
//        }

//        int n =5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i+1; j++) {
//                System.out.print(j+ " ");
//            }
//                System.out.println();
//        }
//        int n=5;
//        int number=1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }

//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

//        for (int i = 1; i <= 5; i++) {
//            System.out.print("         ");
//            for (int j = 1; j <= i; j++) {
//                int sum=i+j;
//                if(sum % 2 == 0){
//                    System.out.print(1+" ");
//                }
//                else{
//                    System.out.print(0+" ");
//                }
//            }
//            System.out.println();
//        }

//         Advance pattern print

//       *                          *
//       *  *                    *  *
//       *  *  *              *  *  *
//       *  *  *  *        *  *  *  *
//       *  *  *  *  *  *  *  *  *  *
//       *  *  *  *  *  *  *  *  *  *
//       *  *  *  *        *  *  *  *
//       *  *  *              *  *  *
//       *  *                    *  *
//       *                          *
        int n = 5;
        // upper part of the pattern
        for (int i = 1; i <= n; i++) {
            System.out.print("       ");
            // 1st star
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            // Space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("   ");
            }
            // 2nd star
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        // Lower part of the pattern
        for (int i = n; i >= 1; i--) {
            System.out.print("       ");
            // 1st star
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            // Space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("   ");
            }
            // 2nd star
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }


//                    *  *  *  *  *
//                 *  *  *  *  *
//              *  *  *  *  *
//           *  *  *  *  *
//        *  *  *  *  *
//     *  *  *  *  *



        for (int i = 0; i <= n; i++) {
            System.out.print("     ");
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

//         End the Function
    }
}
