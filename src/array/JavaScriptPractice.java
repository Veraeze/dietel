package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static array.PrimeFactors.convertToArray;
import static array.RemoveDuplicate.countUniqueValues;
import static array.RemoveDuplicate.stripArray;

public class JavaScriptPractice {
    public static void main(String[] args) {
        int solution = remove(new int[]{1});
        System.out.println(solution);
    }
        public  static int remove(int[] numbers) {
            int result = 0;
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0 ; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {;
                        count++;
                    }
                }   if (count == 1) result = numbers[i];
                count = 0;
            }
            return result;
        }

    }

