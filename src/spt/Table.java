//package spt;
//
//import static java.lang.Math.pow;
//
//public class Table {
//
//    public static void main(String[] args) {
//
//        System.out.println("a    b   pow(a, b)");

//        int integer = 0;
//       int result = 1;
//
//        for (int power = 2; power <= 6; power++) {
//
//            integer = integer + 1;
//
//            result = (int) pow(integer, power);
//
//                System.out.printf("%d    %d    %d", integer, power, result);
//                System.out.println();

        //           }
//        int result = 1;
//
//        for (int integer = 1; integer <= 5; integer++) {
//            for (int power = 2; power <= 6; power++) {
//            for (int power = 2; power > 0; power--) {
//
//                result = result * integer;
//            }
//            for (int power = 3; power > 0; power--) {
//
//                result = result * integer;
//            }
//            for (int power = 4; power > 0; power--) {
//
//                result = result * integer;
//            }
//            for (int power = 5; power > 0; power--) {
//
//                result = result * integer;
//            }
//            for (int power = 6; power > 0; power--) {
//
//                result = result * integer;
//            }
//            System.out.printf("%d    %d    %d", integer, power, result);
//            System.out.println();
//        }
//    }
//}