package array;

import java.util.ArrayList;
import java.util.Arrays;

import static array.PrimeFactors.convertToArray;

public class HCF {

        public static void main(String[] args) {
                int[] array = {6, 3, 9};
                ArrayList<Integer> factors = new ArrayList<>();
                int max = largestOf(array);
                for (int count = 2; count < max;){
                        if (divideArray(array, count)) {factors.add(count);
                                if (divideArray(returnDividedArray(array, count), count)) factors.add(count);
                        }
                        count++;
                }
                System.out.println(factors);
        }
                public static int[] returnHCF(int[] array){
                        ArrayList<Integer> factors = new ArrayList<>();
                        int max = largestOf(array);
                        for (int count = 2; count < max;){
                                if (divideArray(array, count)) {factors.add(count);
                                        if (divideArray(returnDividedArray(array, count), count)) factors.add(count);
                                }
                                count++;
                        }
                        return convertToArray(factors);
                }
        public static int[] returnDividedArray(int[] array, int number){
                for (int count = 2; count < array.length; count++){
                        array[count] = array[count]/count;
                }
                return array;
        }

        public static boolean divideArray(int[] array, int number){
                for (int count = 0; count < array.length; count++){
                        if (array[count] % number != 0) return false;
                }
                return true;
        }
        public static int largestOf(int[] array){
                int largest = array[0];
                for (int count = 1; count < array.length; count++) {
                        if (largest < array[count]) largest = array[count];
                }
                return largest;
        }
        }



