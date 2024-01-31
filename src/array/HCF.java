package array;

import java.util.ArrayList;
import java.util.Arrays;

public class HCF {

        public static void main(String[] args) {
                int[] array = {8, 4, 12};
                int[] newArray = {};
                ArrayList<Integer> factors = new ArrayList<>();
                ArrayList<Integer> save = new ArrayList<>();
                int max = minOf(array);
                int loop = 0;
                int count = 2;
                        while (count <= max){
                                while (array[loop] % count == 0){
                                        System.out.println(array[loop]);
                                        factors.add(count);
                                        System.out.println(factors);
                                        array[loop] = array[loop] / count;
                                        System.out.println(array[loop]);
                                        loop++;
                                }if (factors.size() == array.length) save.add(factors.get(0));

                        }
                System.out.println(factors);
                System.out.println(save);

        }
        public static int minOf(int[] array) {
                int minimum = array[0];
                for (int count = 1; count < array.length; count++){
                        if (minimum > array[count]) {minimum = array[count];}
                }
                return minimum;
        }
        public static int largestOf(int[] array){
                int largest = array[0];
                for (int count = 1; count < array.length; count++) {
                        if (largest < array[count]) largest = array[count];
                }
                return largest;
        }
        }



