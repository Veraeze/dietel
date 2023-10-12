package array;

import function.Function;
import java.util.Arrays;

public class MinMax {

   public static int[] minMaxSum(int[] array){
       int totalSum = Function.sumOf(array);
       return new int[]{totalSum - Function.largestOf(array), totalSum - Function.smallestOf(array)};
   }

    public static void main(String[] args) {
        int[][] items = {{34, 23, 65}, {25, 67, 44, 68}};
        for (int[] iterate: items){
          System.out.println();
            for (int item: iterate){
                System.out.print(item + "    ");
            }
        }
    }

}



























//for (int avoid = 0; avoid < numbers.length; avoid++) {
//            total = MinMax.sumOf(numbers);
//            total = total - numbers[avoid];
//            System.out.println(total);
//        }